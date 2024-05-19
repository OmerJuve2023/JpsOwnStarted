package com.omersolutions.jpsownstarted;

import com.omersolutions.jpsownstarted.todo.JpsTodoClient;
import com.omersolutions.jpsownstarted.todo.Todo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(JsonPlaceHolderServiceProperties.class)
@SpringBootApplication
public class JpsOwnStartedApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpsOwnStartedApplication.class, args);
    }


    /*CommandLineRunner commandLineRunner(JpsTodoClient jpsTodoClient) {
        return args -> {
            var todo = new Todo(1, 1, "some title", true);
            jpsTodoClient.create(todo);
            var todo1 = new Todo(1, 2, "some title", true);
            jpsTodoClient.create(todo1);
        };
    }*/
}
