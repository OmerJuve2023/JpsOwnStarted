package com.omersolutions.jpsownstarted.todo;

import org.slf4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient;

import java.util.List;

public class JpsTodoClient {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(JpsTodoClient.class);
    private final RestClient restClient;

    public JpsTodoClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public List<Todo> findAll() {
        return restClient.get()
                .uri("/todos")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {
                });
    }

    public Todo findById(long id) {
        return restClient.get()
                .uri("/todos/{id}", id)
                .retrieve()
                .body(Todo.class);
    }

    public Todo create(Todo todo) {
        return restClient.post()
                .uri("/todos")
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }

    public Todo update(Todo todo) {
        return restClient.put()
                .uri("/todos/{id}", todo.id())
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }

    public void delete(long id) {
        restClient.delete()
                .uri("/todos/{id}", id)
                .retrieve()
                .body(Void.class);
    }

}
