package com.mycompany;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class MessageSender {

	Destination destination;

	JmsTemplate jmsTemplate;

	public MessageSender() {
	}

	public static void main(String args[]) {
		MessageSender sender = new MessageSender();
		MessageCreator msgCreator = new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage message = null;

				try{
					message = session.createTextMessage();
					message.setStringProperty("text", "Soumitra");
				}catch (Exception e) {
					// TODO: handle exception
				}
				return message;
			}
		};
		sender.jmsTemplate.send(msgCreator);

	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

}
