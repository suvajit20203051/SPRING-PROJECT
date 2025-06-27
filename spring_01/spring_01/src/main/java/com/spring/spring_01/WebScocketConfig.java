package com.spring.spring_01;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * this is my web config class to handle in web
 */
@Configuration
@EnableWebSocketMessageBroker

public class WebScocketConfig implements WebSocketMessageBrokerConfigurer {

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/chat").setAllowedOrigins("http://localhost:8082").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
	//set message broker
		registry.enableSimpleBroker("/topic");
		
		registry.setApplicationDestinationPrefixes("/app");
		//except massage with /app/sendmessage
	}
	

}
