package com.example.SpringCrudExample;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return StudentServiceStub.getAllStudents();
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudentDetails(@PathVariable Long studentId){
		return StudentServiceStub.getStudentDetails(studentId);
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student){
		return StudentServiceStub.addStudent(student);
	}
	@PutMapping("/updateStudent/{studentId}")
	public Student updateStudent(@PathVariable Long studentId, @RequestBody Student student){
		return StudentServiceStub.updateStudent(studentId, student);
	}
	
	@DeleteMapping("/deleteStudent/{studentId}")
	public Student deleteStudent(@PathVariable Long studentId) {
		return StudentServiceStub.deleteStudent(studentId);
	}
}
