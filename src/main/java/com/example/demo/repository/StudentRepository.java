package com.example.demo.repository;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    @Query(value = "SELECT * FROM student", nativeQuery = true)
    List<StudentEntity> findAllStudent();
}
