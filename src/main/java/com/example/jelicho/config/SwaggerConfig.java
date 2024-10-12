package com.example.jelicho.config;

import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springdoc.core.providers.SpringWebProvider;
import org.springdoc.webmvc.core.providers.SpringWebMvcProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openApi() {
		return new OpenAPI()
			.info(new Info()
				.title("example API")
				.version("1.0")
			);
	}

	// @Bean
	// public SpringWebProvider springWebProvider() {
	// 	return new CustomSpringWebProvider();
	// }
	//
	// public static class CustomSpringWebProvider extends SpringWebMvcProvider {
	// 	@Override
	// 	public Set<String> getActivePatterns(Object requestMapping) {
	// 		Set<String> activePatterns = super.getActivePatterns(requestMapping);
	// 		String paramsWithValue = ((RequestMappingInfo)requestMapping).getParamsCondition()
	// 			.getExpressions()
	// 			.stream()
	// 			.map(expression -> {
	// 				if (expression.getValue() == null) {
	// 					return expression.getName() + "=";
	// 				}
	// 				return expression.getName() + "=" + expression.getValue();
	// 			})
	// 			.reduce((it1, it2) -> it1 + "&" + it2)
	// 			.orElse(StringUtils.EMPTY);
	//
	// 		if (paramsWithValue.equals(StringUtils.EMPTY)) {
	// 			return activePatterns;
	// 		}
	//
	// 		return activePatterns.stream().map(activePattern -> activePattern + "?" + paramsWithValue).collect(
	// 			Collectors.toSet());
	// 	}
	// }
}
