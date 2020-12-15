package com.https.https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpsApplication.class, args);
	}

	@GetMapping(path = "/")
	public String Home() {
		return "HTTPS 테스트 사이트입니다";
	}

}
