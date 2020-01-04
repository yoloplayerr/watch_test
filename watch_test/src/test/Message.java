package test;

import java.util.HashMap;

public abstract class Message extends Clock{
		protected HashMap<String,Message> messages=new HashMap<>(); 
	
		public HashMap<String, Message> getMessages() {
			return messages;
		}
		public void setMessages(HashMap<String, Message> messages) {
			this.messages = messages;
		}
}
