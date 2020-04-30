package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;


@RestController
public class Assignment5 {

	HashMap<String,Employee> hm = new HashMap<String,Employee>();
	
	
	@GetMapping("/assignment5")
    public ResponseEntity<List<Employee>> getAll(){
		
		return  new ResponseEntity<>(new ArrayList<>(hm.values()), HttpStatus.OK);
    }
	
	@PostMapping("assignment5/postData")
	public ResponseEntity<Object> postData(@RequestBody Employee employee){
		if(!hm.containsKey(employee.getId())) {
			hm.put(employee.getId(), employee);
			return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
		}
        return  new ResponseEntity<>("Product already exists", HttpStatus.ACCEPTED);
    }
	
	@PutMapping("assignment5/update")
	public ResponseEntity<Object> putData(@RequestBody Employee employee){
		if(hm.containsKey(employee.getId())) {
			hm.put(employee.getId(), employee);
			return new ResponseEntity<>("Employee updated successfully", HttpStatus.CREATED);
		}
		return  new ResponseEntity<>("Employee does not exists", HttpStatus.ACCEPTED);
    }
	
	@DeleteMapping("assignment5/delete")
	public ResponseEntity<Object> deleteData(@RequestBody Employee employee){
		if(hm.containsKey(employee.getId())) {
			hm.remove(employee.getId());
			return new ResponseEntity<>("Employee deleted successfully", HttpStatus.CREATED);
		}
		return  new ResponseEntity<>("Employee does not exists", HttpStatus.ACCEPTED);
    }
	
	
}