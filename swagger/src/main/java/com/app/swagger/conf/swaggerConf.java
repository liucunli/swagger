package com.app.swagger.conf;

import java.util.ArrayList;

import org.apache.catalina.connector.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swaggerConf {
	@Bean
	public Docket docket0() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com"))
				.build();
	}
	Contact contact = new Contact("li", "no", "ss");
	public ApiInfo apiInfo() {
		return new ApiInfo(
				"li Api",
				"test Api", 
				"1.0",
				"urn:tos",
				 contact,
		          "Apache 2.0", 
		          "http://www.apache.org/licenses/LICENSE-2.0", 
		          new ArrayList<VendorExtension>()
		          );
	}
}
