create table FRIENDS(user_id integer, friend_id integer);
create table USER_MESSAGES(user_message_id serial primary key, sender_id integer, receiver_id integer, message varchar, time_stamp timestamp default current_timestamp);
create table BUSINESS_MESSAGES(business_message_id serial primary key, business_id integer, event_id integer, message varchar, time_stamp timestamp default current_timestamp);
create table SUBSCRIPTIONS(subcription_id serial primary key, user_id integer, business_id integer, time_of_sub timestamp default current_timestamp, rsvp_count integer);
create table basic_user(
	basic_user_id serial primary key,
	username varchar unique not null,
	password varchar not null,
	first_name varchar not null,
	last_name varchar not null
);

create table business_user(
	business_id serial primary key,
	username varchar unique not null,
	password varchar not null,
	business_name varchar not null,
	business_location varchar not null
);

create table event(
	event_id serial primary key,
	basic_user_id integer references basic_user (basic_user_id),
	business_id integer references business_user (business_id),
	title varchar not null,
	location varchar not null,
	time_of_event time not null,
	date_of_event date not null,
	time_posted timestamp default current_timestamp,
	description varchar,
	on_timeline boolean default true
);

create table rsvps(
	rsvp_id serial primary key,
	basic_user_id integer references basic_user (basic_user_id),
	event_id integer references event (event_id)
);

create table business_employee_user(
	business_employee_user_id serial primary key,
	business_id integer references business_user (business_id),
	business_message_id integer references business_messages (business_message_id),
	username varchar unique not null,
	password varchar not null
);

create table event_messages(
	event_message_id serial primary key,
	sender_id integer references basic_user (basic_user_id),
	event_id integer references event (event_id),
	message varchar not null,
	time_posted timestamp default current_timestamp
);
ALTER TABLE "HangOut".subscriptions ADD CONSTRAINT subscriptions_fk_1 FOREIGN KEY (business_id) REFERENCES business_user(business_id)
ALTER TABLE "HangOut".subscriptions ADD CONSTRAINT subscriptions_fk FOREIGN KEY (user_id) REFERENCES basic_user(basic_user_id)
ALTER TABLE "HangOut".user_messages ADD CONSTRAINT user_messages_fk FOREIGN KEY (sender_id) REFERENCES basic_user(basic_user_id)
ALTER TABLE "HangOut".business_messages ADD CONSTRAINT business_messages_fk_1 FOREIGN KEY (event_id) REFERENCES event(event_id)
ALTER TABLE "HangOut".user_messages ADD CONSTRAINT user_messages_fk FOREIGN KEY (sender_id) REFERENCES basic_user(basic_user_id)
ALTER TABLE "HangOut".user_messages ADD CONSTRAINT user_messages_fk_1 FOREIGN KEY (receiver_id) REFERENCES basic_user(basic_user_id)
