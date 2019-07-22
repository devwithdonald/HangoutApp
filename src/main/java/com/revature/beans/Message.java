package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="MESSAGES")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Message {
	
	@Id
	@Column(name = "MESSAGE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer messageId;
	
	@Column(name = "MESSAGE")
	private String message;
	
	@Column(name = "TIME_SENT")
	private String timeOfMessage;

	public Message() {
		super();
	}

	public Message(Integer messageId, String message, String timeOfMessage) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.timeOfMessage = timeOfMessage;
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimeOfMessage() {
		return timeOfMessage;
	}

	public void setTimeOfMessage(String timeOfMessage) {
		this.timeOfMessage = timeOfMessage;
	}

//	@Override
//	public String toString() {
//		return "Message [messageId=" + messageId + ", message=" + message + ", timeOfMessage=" + timeOfMessage + "]";
//	}

}