package net.sms.service.impl;

import lombok.AllArgsConstructor;
import net.sms.dto.StudentDto;
import net.sms.entity.Student;
import net.sms.mapper.StudentMapper;
import net.sms.repository.StudentRepository;
import net.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(StudentMapper::mapToStudentDto)
                .collect(Collectors.toList());
    }
}
