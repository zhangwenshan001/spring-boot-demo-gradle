package com.zhangwenshan001.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DemoHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHelloworldApplication.class, args);
	}
	@GetMapping("/hello")
	public String sayHello(@RequestParam(required = false, name="who") String who) {

		if (StringUtils.isBlank(who)) {
			who = "World";
		}
		return String.format("Hello, %s!", who);
	}
}
