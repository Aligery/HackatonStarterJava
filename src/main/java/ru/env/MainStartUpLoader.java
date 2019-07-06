package ru.env;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import ru.env.rest.SimpleUserRESTController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


//TODO: swagger config+security mb

//TODO: config swagger in another classes

//TODO: XML mapping is better, mb rewrite on XML

@SpringBootApplication
@ComponentScan({"ru.env.rest", "ru.env.service"})
@MapperScan({"ru.env.mapper"})
@EnableSwagger2
public class MainStartUpLoader {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(MainStartUpLoader.class);
    }
}
