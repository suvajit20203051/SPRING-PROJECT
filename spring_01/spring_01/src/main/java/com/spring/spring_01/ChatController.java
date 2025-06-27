package com.spring.spring_01;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//this is my controller class here we handle all handlermethod
@Controller
public class ChatController {
	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public ChatMessage sendMessage(ChatMessage message) {
		
		return message;
		
		
	}
	@GetMapping("/chat")
	public String chat() {
		return "redirect:/chat.html";
	}

}