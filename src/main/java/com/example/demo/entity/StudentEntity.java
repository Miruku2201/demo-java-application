package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class StudentEntity extends BaseEntity{
    @Column(name = "name")
    private String name;

    @Column(name = "class")
    private String classRoom;

    @Column(name = "student_id")
    private String studentId;
}
