package com.br.lukreitor.todospringboot.todowebapp.todo;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class TodoController {

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    private TodoService todoService;


    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("Lukreitor");
        model.addAttribute("todos", todos);
        return "list-todos";
    }

    //add todo
    @RequestMapping("add-todo")
    public String addTodo() {
        return "todo";
    }


}
