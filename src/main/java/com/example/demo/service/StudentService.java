package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.response.GetOneStudentResponse;
import com.example.demo.response.ListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public ListResponse getAllStudent(){
        List<StudentEntity> listStudent = studentRepository.findAllStudent();

        List<GetOneStudentResponse> responses = new ArrayList<>();
        for(StudentEntity loopStudent : listStudent) {
            responses.add(new GetOneStudentResponse(
                    loopStudent.getName(),
                    loopStudent.getClassRoom(),
                    loopStudent.getStudentId()
            ));
        }

        return new ListResponse(responses);
    }
}
