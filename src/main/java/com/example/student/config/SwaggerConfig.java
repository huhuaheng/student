package com.example.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.TagsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @ClassName SwaggerConfig
 * @Description TODO
 * @Author 胡
 * @Date 2023/2/17 15:33
 * @Version 1.0
 **/
@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig  {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Student API Documentation")
                .version("1.0")
                .build();
    }

    @Bean
    public UiConfiguration uiConfiguration(){
        UiConfigurationBuilder uiConfigurationBuilder = UiConfigurationBuilder.builder();
        uiConfigurationBuilder.operationsSorter(OperationsSorter.METHOD);
        uiConfigurationBuilder.tagsSorter(TagsSorter.ALPHA);
        uiConfigurationBuilder.filter(true);
        uiConfigurationBuilder.displayRequestDuration(true);
        return uiConfigurationBuilder.build();
    }

}
