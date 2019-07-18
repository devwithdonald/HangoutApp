package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
		result = prime * result + ((timeOfMessage == null) ? 0 : timeOfMessage.hashCode());
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
		Message other = (Message) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (messageId == null) {
			if (other.messageId != null)
				return false;
		} else if (!messageId.equals(other.messageId))
			return false;
		if (timeOfMessage == null) {
			if (other.timeOfMessage != null)
				return false;
		} else if (!timeOfMessage.equals(other.timeOfMessage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", message=" + message + ", timeOfMessage=" + timeOfMessage + "]";
	}

}