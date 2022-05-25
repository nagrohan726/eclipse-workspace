package com.rohan.springboot.springjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${springjms.myQueue}")
	private String queue;

	public void send(String message) {
		System.out.println("Message Sent ==> " + message);

//		Method 1
//		jmsTemplate.convertAndSend(queue, message);

//		Method 2
//		MessageCreator messageCreator = new MessageCreator() {
//
//			@Override
//			public Message createMessage(Session session) throws JMSException {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//		};
//		jmsTemplate.send(queue, messageCreator);

//		Method 3
		jmsTemplate.send(queue, session -> session.createTextMessage("This is a modified message"));

//		Topic instead of Queue
//		jmsTemplate.setPubSubDomain(true);

	}

}
