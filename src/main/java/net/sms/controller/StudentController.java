package net.sms.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.sms.dto.StudentDto;
import net.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class StudentController {

    private StudentService studentService;

    @GetMapping("/students")
    public String listStudents(Model model){
        List<StudentDto> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/students/new")
    public String newStudent(Model model){
        StudentDto studentDto = new StudentDto();
        model.addAttribute("student", studentDto);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@Valid @ModelAttribute("student") StudentDto studentDto,
                              BindingResult result,
                              Model model){

        if(result.hasErrors()){
//            model.addAttribute("student", studentDto); // not needed as we are not redirecting or forwarding so student attribute is still active
            return "create_student";
        }

        studentService.createStudent(studentDto);
        return "redirect:/students";
    }

    @GetMapping("/students/{studentId}/edit")
    public String editStudent(@PathVariable("studentId") Long studentId,
                              Model model){
        StudentDto student = studentService.getStudentById(studentId);
        model.addAttribute("student", student);
        return "edit_student";
    }
}
