package com.example.jelicho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jelicho.dto.ExampleDataForService1Dto;
import com.example.jelicho.dto.ExampleDataForService2Dto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/example")
@Tag(name = "Example")
public class ExampleController {

@Operation(
	operationId = "exampleForService1",
	description = "Returns Example data for service1 application."
)
@GetMapping(value = "/{exampleNo}", params = "application=service1")
public ExampleDataForService1Dto exampleForService1(
	@PathVariable String exampleNo
) {
	return ExampleDataForService1Dto.builder()
		.exampleNo(exampleNo)
		.exampleName("exampleName")
		.build();
}

@Operation(
	operationId = "exampleForService2",
	description = "Returns Example data for service2 application."
)
@GetMapping(value = "/{exampleNo}", params = "application=service2")
public ExampleDataForService2Dto exampleForService2(
	@PathVariable String exampleNo
) {
	return ExampleDataForService2Dto.builder()
		.exampleNo(exampleNo)
		.exampleAddress("exampleAddress")
		.build();
}
}
