package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TodoMapper;
import com.example.demo.model.Todo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MyService {
	@Autowired
	TodoMapper todoMapper;
	
	public List<Todo> getTodoList(){
		
	List<Todo> todoList = todoMapper.findAll();
	
	return todoList;
		
	}
}
