package com.garcia.springboot.tls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class TlsController {

	@GetMapping(value="/tls")
	public String validateTls() {
		log.info("Testing TLS version {}", "1.2");
		return "TLSv1.2 tested...";
	}
	
}
