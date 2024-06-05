package net.sms.mapper;

import net.sms.dto.StudentDto;
import net.sms.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(
                student.getId(),
                student.getLastName(),
                student.getFirstName(),
                student.getEmail()
        );
    }

    public static Student mapToStudent(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getLastName(),
                studentDto.getFirstName(),
                studentDto.getEmail()
        );
    }
}
