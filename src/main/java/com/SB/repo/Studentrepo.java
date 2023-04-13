package com.SB.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SB.model.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}
