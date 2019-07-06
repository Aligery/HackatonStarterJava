package ru.env;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import ru.env.rest.SimpleUserRESTController;


@SpringBootApplication
@ComponentScan({"ru.env.mapper", "ru.env.rest", "ru.env.service"})
public class MainStartUpLoader {


    public static void main(String[] args) {
        SpringApplication.run(MainStartUpLoader.class);
    }
}
