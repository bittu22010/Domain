package ClassSpringBootSecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ClassSpringBootSecurity.model.StudentBean;
import ClassSpringBootSecurity.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentSecurity")
	public String disp() {
		return "Demo Student security rest api..";
	}
	
	@GetMapping("/student")
	public List<StudentBean> getStudents() {

		List<StudentBean> students = new ArrayList<>();
		students.add(new StudentBean(1 , "Mayank kumar" ,"mayank1@gmail.com" , "demo1"));
		students.add(new StudentBean(2 , "Raushan kumar" , "raushan2@gmail.com" , "demo2"));
		students.add(new StudentBean(3 , "Kaushal kumar" , "kaushal3@gmail.com" , "demo3"));
		
		return studentService.createallStudent(students);
	}
	
	@PostMapping("/students")
	public StudentBean createStudent(@RequestBody StudentBean student) {
		return studentService.createStudent(student);
	}
	
}

