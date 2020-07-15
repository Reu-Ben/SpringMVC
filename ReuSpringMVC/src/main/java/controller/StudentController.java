package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.StudentService;
import model.Student;



@RestController
@RequestMapping("crudmvc")

public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping("/student")
	public List<Student> getStudent() {
		
		return studentService.getAllStudents();
		
	}
	
	@RequestMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") String id) {
		return studentService.getStudentById(id);
	}
	
	
}
