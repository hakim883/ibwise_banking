package com.exis.banking.ibwise.core.serviceparameter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/ibwise/core/api/v1/param")
@RequiredArgsConstructor
public class ParamMainController {

	@GetMapping("/get")
	public String param() {
		return "this is a test";
	}
}
