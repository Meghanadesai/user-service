package com.rest.webservice.restfulwebservice.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@GetMapping("/hello-world")
	public String hello() {
		return "HelloWorld";
	}
	
	@GetMapping("/hello-world-bean")
	public HellowWorldBean helloWorldBean() {
		return new HellowWorldBean("HelloWorld");
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HellowWorldBean helloWorldBean(@PathVariable String name) {
		return new HellowWorldBean(String.format("HelloWorld, %s", name));
	}
	
	@GetMapping("/hello-world-internationalized")
	public String helloInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
	}
}
