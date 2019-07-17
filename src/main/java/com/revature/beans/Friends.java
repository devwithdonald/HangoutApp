package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FRIENDS")
public class Friends {
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private BasicUser basicUser;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="FRIEND_ID")
	private BasicUser basicFriendUser;

	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friends(BasicUser basicUser, BasicUser basicFriendUser) {
		super();
		this.basicUser = basicUser;
		this.basicFriendUser = basicFriendUser;
	}

	public BasicUser getBasicUser() {
		return basicUser;
	}

	public void setBasicUser(BasicUser basicUser) {
		this.basicUser = basicUser;
	}

	public BasicUser getBasicFriendUser() {
		return basicFriendUser;
	}

	public void setBasicFriendUser(BasicUser basicFriendUser) {
		this.basicFriendUser = basicFriendUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((basicFriendUser == null) ? 0 : basicFriendUser.hashCode());
		result = prime * result + ((basicUser == null) ? 0 : basicUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friends other = (Friends) obj;
		if (basicFriendUser == null) {
			if (other.basicFriendUser != null)
				return false;
		} else if (!basicFriendUser.equals(other.basicFriendUser))
			return false;
		if (basicUser == null) {
			if (other.basicUser != null)
				return false;
		} else if (!basicUser.equals(other.basicUser))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Friends [basicUser=" + basicUser + ", basicFriendUser=" + basicFriendUser + "]";
	}


	
}