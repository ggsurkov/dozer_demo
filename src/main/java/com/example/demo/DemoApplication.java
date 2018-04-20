package com.example.demo;

import domain.Card;
import entity.CardEntity;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		BeanMappingBuilder builder = new BeanMappingBuilder() {
			@Override
			protected void configure() {
				mapping(Card.class, CardEntity.class)
						.fields("name", "nom")
						.fields("nickname", "surnom");
			}
		};
	}
}
