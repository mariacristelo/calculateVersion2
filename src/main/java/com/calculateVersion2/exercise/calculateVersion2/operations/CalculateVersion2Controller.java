package com.calculateVersion2.exercise.calculateVersion2.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateVersion2Controller {
	@Autowired
	private CalculateVersion2Service service;
	
	@RequestMapping(method=RequestMethod.POST, value="/calculate")
	public CalculateVersion2Response calculate (@RequestBody CalculateVersion2 values) {
		//throw new InvalidParametersException("Deu barraca");
		return service;
	}
}
