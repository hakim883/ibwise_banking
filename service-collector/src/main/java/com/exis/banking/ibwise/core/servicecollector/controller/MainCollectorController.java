package com.exis.banking.ibwise.core.servicecollector.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exis.banking.ibwise.core.servicecollector.services.IFileCollectorService;



@RestController
@RequestMapping("/ibwise/core/api/v1/collector")
public class MainCollectorController {

	@Autowired
	IFileCollectorService _fileCollectSvc;
	
	@RequestMapping("/start")
	public String start() {
		_fileCollectSvc.start();
		return "done";
	}
	
}
