package com.spring.spring_01;

import lombok.Data;
import lombok.NoArgsConstructor;
// its like entity class
@Data
@NoArgsConstructor

public class ChatMessage {
	
	private Long id;
	private String sender;
	private String content;
	public String getSender() {
		return sender;


}
	public ChatMessage(Long id, String sender, String content) {
		super();
		this.id = id;
		this.sender = sender;
		this.content = content;
	}
	public ChatMessage() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
}
