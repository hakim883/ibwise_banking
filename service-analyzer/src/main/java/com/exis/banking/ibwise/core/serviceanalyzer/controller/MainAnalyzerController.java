package com.exis.banking.ibwise.core.serviceanalyzer.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exis.banking.ibwise.core.serviceanalyzer.services.ISwiftDocumentParser;



@RestController
@RequestMapping("/ibwise/core/api/v1/analyzer")
public class MainAnalyzerController {
	@Autowired
	ISwiftDocumentParser swDocParser;
	
	@GetMapping("/start")
	public String get() {
		
		try {
			swDocParser.parse("D:\\tmp\\swift\\in\\mt103.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return "success ..."; 
	}
}
