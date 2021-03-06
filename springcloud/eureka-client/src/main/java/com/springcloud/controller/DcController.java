package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
	@Autowired
	DiscoveryClient discoveryClient;

	@GetMapping("/")
	public String dc() {
		String services = "Services: " + discoveryClient.getServices();
		return services;
	}
}
