package com.mindtree.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.studentcrud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
