package com.designpattern.structural.bridge2;

public class TextMessageSender implements MessageSender {
    @Override
    public void sendMessage(){
        System.out.println("TextMessageSender: Sending text message...");
    }
}