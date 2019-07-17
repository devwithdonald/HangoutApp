package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name = "USER_MESSAGES")
public class UserMessage extends Message {
                                                                                
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="SENDER_ID")
    private BasicUser sender;
                                                                                
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="RECEIVER_ID")
    private BasicUser receiver;

    public UserMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UserMessage(Integer messageId, String message, String timeOfMessage) {
        super(messageId, message, timeOfMessage);
        // TODO Auto-generated constructor stub
    }

    public UserMessage(BasicUser sender, BasicUser receiver) {
        super();
        this.sender = sender;
        this.receiver = receiver;
    }

    public BasicUser getSender() {
        return sender;
    }

    public void setSender(BasicUser sender) {
        this.sender = sender;
    }

    public BasicUser getReceiver() {
        return receiver;
    }

    public void setReceiver(BasicUser receiver) {
        this.receiver = receiver;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((receiver == null) ? 0 : receiver.hashCode());
        result = prime * result + ((sender == null) ? 0 : sender.hashCode());
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
        UserMessage other = (UserMessage) obj;
        if (receiver == null) {
            if (other.receiver != null)
                return false;
        } else if (!receiver.equals(other.receiver))
            return false;
        if (sender == null) {
            if (other.sender != null)
                return false;
        } else if (!sender.equals(other.sender))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UserMessage [sender=" + sender + ", receiver=" + receiver + "]";
    }

                                                                                
                                                                                

                                                                                
}