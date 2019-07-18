drop table basic_user cascade;
drop table business_user cascade;
drop table business_employee_user cascade;
drop table business_messages cascade;
drop table events cascade;
drop table event_messages cascade;
drop table role cascade;
drop table users cascade;
drop table rsvps cascade;
drop table friends cascade;
drop table subscriptions cascade;
drop table user_messages cascade;
drop table messages cascade;


--will need default values input
create table role (
	role_id serial primary key,
	role_type varchar unique not null
);

create table users (
	user_id serial primary key,
	username varchar unique not null,
	password varchar unique null,
	role_id integer not null references role (role_id)
);

create table basic_user (
	user_id integer not null unique references users (user_id),
	first_name varchar not null,
	last_name varchar not null
);

create table business_user (
	user_id integer not null unique references users (user_id),
	business_name varchar not null,
	business_location varchar not null
);

create table messages (
	message_id serial primary key,
	message varchar,
	time_sent timestamp default current_timestamp
);

create table business_messages(
	message_id integer not null unique references messages (message_id),
	business_id integer references business_user (user_id) 
	--event_id integer references events (event_id)
);

create table events (
	event_id serial primary key,
	user_id integer references users (user_id),
	business_message_id integer references business_messages (message_id),
	title varchar not null,
	location varchar not null,
	time_of_event time not null,
	date_of_event date not null,
	time_posted timestamp default current_timestamp,
	description varchar,
	on_timeline boolean default true
);




create table event_messages(
	message_id integer not null unique references messages (message_id),
	sender_id integer references basic_user (user_id),
	event_id integer references events (event_id)
);

create table user_messages(
	message_id serial primary key, 
	sender_id integer references basic_user (user_id),  
	receiver_id integer references basic_user (user_id)
);

create table business_employee_user (
	user_id integer not null unique references users (user_id),
	business_id integer references business_user (user_id)
);

create table rsvps(
	rsvp_id serial primary key,
	basic_user_id integer references basic_user (user_id),
	event_id integer references events (event_id)
);


-- create references in table
create table friends (
	user_id integer references basic_user (user_id), 
	friend_id integer references basic_user (user_id)
);


create table subscriptions (
	subcription_id serial primary key, 
	basic_user_id integer references basic_user (user_id), 
	business_id integer references business_user (user_id), 
	time_of_sub timestamp default current_timestamp, 
	rsvp_count integer
);

insert into role (role_type)
	values ('BasicUser'), ('Business'), ('BusinessEmployee'); 
