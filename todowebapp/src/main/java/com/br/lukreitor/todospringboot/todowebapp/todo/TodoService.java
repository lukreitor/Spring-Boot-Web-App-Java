package com.br.lukreitor.todospringboot.todowebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "Lukreitor", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Lukreitor", "Learn Spring Boot", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "Lukreitor", "Learn React", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(4, "Lukreitor", "Learn AWS Alura", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(5, "Lukreitor", "Learn Java Project", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(6, "Lukreitor", "Learn Java Udemy", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(7, "Lukreitor", "Learn English Ivolve", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(8, "Lukreitor", "Learn Diagrams", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(9, "Lukreitor", "Learn Frontend Masters", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(10, "Lukreitor", "Learn IHC Presentation", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(11, "Lukreitor", "Learn OO Test", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(12, "Lukreitor", "Learn Presentation Part 1", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(13, "Lukreitor", "Learn Redes Content", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        /* 
        List<Todo> filteredTodos = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getUsername().equals(username)) {
                filteredTodos.add(todo);
            }
        }
        */
        return todos;
    }
}
