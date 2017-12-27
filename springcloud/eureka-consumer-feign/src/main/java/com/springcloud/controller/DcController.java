package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.Icontroller.DcClient;

@RestController
public class DcController {

	@Autowired
    DcClient dcClient;
	
	@GetMapping("/")
    public String dc() {
        return dcClient.consumer();
    }
	
}
