package com.designpattern.structural.bridge2;
//https://springframework.guru/gang-of-four-design-patterns/bridge-pattern/

/*
             Message	<-----HAS-A ----------  	MessageSender
  
TextMessage        EmailMessage          TestMessageSender       EmailMessageSender     
    
*/
public abstract class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender){
        this.messageSender=messageSender;
    }
     abstract public void send();
}