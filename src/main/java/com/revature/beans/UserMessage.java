package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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

    @Autowired
    public void setSender(BasicUser sender) {
        this.sender = sender;
    }

    public BasicUser getReceiver() {
        return receiver;
    }

    @Autowired
    public void setReceiver(BasicUser receiver) {
        this.receiver = receiver;
    }

//    @Override
//    public String toString() {
//        return "UserMessage [sender=" + sender + ", receiver=" + receiver + "]";
//    }

                                                                                
                                                                                

                                                                                
}