package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="BASIC_USER")
public class BasicUser extends User{
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	//TODO this may be wrong
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="FRIENDS",
			joinColumns=@JoinColumn(name="USER_ID"),
			inverseJoinColumns=@JoinColumn(name="USER_ID"))
	private Set<Friends> friendList;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="basicUser")
	private Set<Subscriptions> subscriptions = new HashSet<Subscriptions>();
	
	public BasicUser() {
		super();
	}
	
	public BasicUser(int id, String username, String password) {
		super(id, username, password);
	}
	
	public BasicUser(String firstName, String lastName, Set<Friends> friendList,
			Set<Subscriptions> subscriptions) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.friendList = friendList;
		this.subscriptions = subscriptions;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Set<Friends> getFriendList() {
		return friendList;
	}
	
	public void setFriendList(Set<Friends> friendList) {
		this.friendList = friendList;
	}
	
	public Set<Subscriptions> getSubscriptions() {
		return subscriptions;
	}
	
	public void setSubscriptions(Set<Subscriptions> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicUser other = (BasicUser) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "BasicUser [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}