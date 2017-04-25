package com.designpattern.structural.bridge2;

import org.junit.Test;

public class MessageTest {
	 
    @Test
    public void testSend() throws Exception {
      MessageSender textMessageSender=new TextMessageSender();
      Message textMessage=new TextMessage(textMessageSender);
      textMessage.send();
 
       MessageSender emailMessageSender=new EmailMessageSender();
       Message emailMessage=new TextMessage(emailMessageSender);
       emailMessage.send();
    }
}
