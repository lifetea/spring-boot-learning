package com.lifetea.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置类
 * Created by cent on 2016/10/31.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     * swagger摘要bean
     * @return
     */
    @Bean
    public Docket restApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lifetea"))
                .paths(PathSelectors.any())
                .build()
                ;

        return docket;
    }

    /**
     * API文档主信息对象
     * @return
     */
    private ApiInfo apiInfo(){
        ApiInfo apiInfo= (new ApiInfoBuilder())
                .title("Spring Boot集成Swagger项目")
                .description("Spring Boot集成Swagger的Demo API")
                .termsOfServiceUrl("http://localhost:8080/")
//                .contact(new Contact("cent","","292462859@qq.com"))
                .version("1.0")
                .build();
        return apiInfo;
    }
}
