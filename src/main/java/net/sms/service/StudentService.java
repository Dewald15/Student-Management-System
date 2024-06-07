package net.sms.service;

import net.sms.dto.StudentDto;
import net.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
    void createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long id);
    void updateStudent(StudentDto studentDto);
}
