package com.example.jelicho.dto;

import lombok.Builder;

@Builder
public record ExampleDataForService2Dto(
	String exampleNo,

	String exampleAddress
) {
}
