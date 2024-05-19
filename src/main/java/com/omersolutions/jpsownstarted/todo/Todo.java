package com.omersolutions.jpsownstarted.todo;

public record Todo(
        int userId,
        int id,
        String title,
        boolean completed) {
}
