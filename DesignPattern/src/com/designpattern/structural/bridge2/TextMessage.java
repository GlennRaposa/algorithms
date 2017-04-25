package com.designpattern.structural.bridge2;

public class TextMessage extends Message{
	 
    public TextMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(){
      messageSender.sendMessage();
    }
 
}