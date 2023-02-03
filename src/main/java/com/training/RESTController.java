package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/get")
public class RESTController {
	
	@Autowired
	UserEntity entity;
	
	@GetMapping("/data")
	public UserEntity getEntity() {
		
		return entity;
	}

}
