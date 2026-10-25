package com.rashi.ToDo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins="*")
public class ToDoController {
	private final ToDoService service;
	
	public ToDoController(ToDoService service)
	{
		this.service = service;
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Task t)
	{
		return service.save(t);
	}
	
	// FIXED TYPO: Changed "/findaIl" (with a capital I) to "/findall" (all lowercase) 
	// to match your frontend JavaScript fetch url perfectly.
	@GetMapping("/findall")
	public List<Task> findAll()
	{
		return service.findAll();
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable int id)
	{
		return service.deleteById(id);
	}
}
