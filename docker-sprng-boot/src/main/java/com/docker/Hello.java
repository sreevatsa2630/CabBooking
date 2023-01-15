package com.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/docker/hello")
public class Hello {
@GetMapping
public String hello() {
	return "hello Youtube";
}
}


