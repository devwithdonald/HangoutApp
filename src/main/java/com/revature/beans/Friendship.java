//package com.revature.beans;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Component;
//
//@Component
//@Entity
//@Table(name="FRIENDS")
//public class Friendship {
//	
//	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//	@JoinColumn(name="USER_ID")
//	private User userId;
//	
//	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//	@JoinColumn(name="FRIEND_ID")
//	private User friendId;
//
//	public Friendship() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Friendship(User userId, User friendId) {
//		super();
//		this.userId = userId;
//		this.friendId = friendId;
//	}
//
//	public User getUserId() {
//		return userId;
//	}
//
//	public void setUserId(User userId) {
//		this.userId = userId;
//	}
//
//	public User getFriendId() {
//		return friendId;
//	}
//
//	public void setFriendId(User friendId) {
//		this.friendId = friendId;
//	}
//
//	@Override
//	public String toString() {
//		return "Friendship [userId=" + userId + ", friendId=" + friendId + "]";
//	}
//	
//	
//
//}
