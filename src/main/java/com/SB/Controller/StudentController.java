package com.SB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SB.model.Student;
import com.SB.service.Studentservice;

@RestController
public class StudentController {
	@Autowired
	Studentservice sser;
	@GetMapping("/api/students")
	public List<Student> getallstudents(Student st){
	return	sser.allstudents();
	}
	@PostMapping("/student")
	public Student studentsave(@RequestBody Student st) {
		return sser.savestudent(st);
		 
	}

}
