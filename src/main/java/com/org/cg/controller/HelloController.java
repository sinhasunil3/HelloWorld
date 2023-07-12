package com.org.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping("/welcome")
	public String getWorld() {
		return "Hello welcome Java DevOps";
	}

}
