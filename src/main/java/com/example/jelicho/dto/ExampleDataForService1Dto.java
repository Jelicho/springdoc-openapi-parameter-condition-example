package com.example.jelicho.dto;

import lombok.Builder;

@Builder
public record ExampleDataForService1Dto(
	String exampleNo,

	String exampleName
) {
}
