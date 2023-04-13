package com.SB.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SB.model.Student;
import com.SB.repo.Studentrepo;


@Service
public class Studentservice {
	@Autowired
	Studentrepo srepo;
	public List<Student> allstudents(){
		List ls=new ArrayList<>();
	srepo.findAll().forEach((students)->ls.add(students));
	return ls;
	
	}
	public Student savestudent(Student std) {
		  return srepo.save(std);
		 
		
		  
	}

}
