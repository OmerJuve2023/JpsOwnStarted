package com.omersolutions.jpsownstarted.todo;

import com.omersolutions.jpsownstarted.JsonPlaceHolderServiceProperties;
import com.omersolutions.jpsownstarted.JsonPlaceholderServiceConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.web.client.RestClientAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JpsTodoClientTest {
    private final ApplicationContextRunner runner =
            new ApplicationContextRunner()
                    .withConfiguration(
                            AutoConfigurations.of(
                                    JsonPlaceholderServiceConfiguration.class, RestClientAutoConfiguration.class));

    @Test
    void shouldContainTodoRestClientBean() {
        runner.run(context -> {
            assertTrue(context.containsBean("jsonPlaceHolderRestClient"));
            assertTrue(context.containsBean("jpsTodoClient"));
        });
    }

    @Test
    void shouldContainDefaultBaseUrl() {
        runner.run(context -> {
            assertEquals("https://jsonplaceholder.typicode.com",
                    context.getBean(JsonPlaceHolderServiceProperties.class).url());
        });
    }

    @Test
    void shouldFindAllTodos() {
        runner.run(context -> {
            JpsTodoClient jpsTodoClient = context.getBean(JpsTodoClient.class);
            assertEquals(200, jpsTodoClient.findAll().size());
        });
    }

    @Test
    void shouldFindTodoById() {
        runner.run(context -> {
            JpsTodoClient jpsTodoClient = context.getBean(JpsTodoClient.class);
            assertEquals(200, jpsTodoClient.findById(200).id());
        });
    }

    @Test
    void shouldCreateTodo() {
        runner.run(context -> {
            JpsTodoClient jpsTodoClient = context.getBean(JpsTodoClient.class);
            Todo todo = new Todo(201, 1, "some title", true);
            assertEquals(201, jpsTodoClient.create(todo).id());
        });
    }

    @Test
    void shouldUpdateTodo() {
        runner.run(context -> {
            JpsTodoClient jpsTodoClient = context.getBean(JpsTodoClient.class);
            Todo todo = new Todo(200, 200, "some title omer", true);
            assertEquals(200, jpsTodoClient.update(todo).id());
        });
    }

    @Test
    void shouldDeleteTodo() {
        runner.run(context -> {
            JpsTodoClient jpsTodoClient = context.getBean(JpsTodoClient.class);
            jpsTodoClient.delete(200);
        });
    }

}