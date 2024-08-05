package com.assesment.sis.controller;

import java.util.List;

import com.assesment.sis.entities.SubjectList;
import com.assesment.sis.repository.StudentListRepository;
import com.assesment.sis.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.assesment.sis.entities.StudentList;
import com.assesment.sis.service.StudentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private StudentListRepository studentListRepository;

	@GetMapping("/studentList")
	public ResponseEntity<List<StudentList>> getAllStudents() {
		List<StudentList> students = studentService.getAllStudents();
		return ResponseEntity.ok(students);

	}
	@PostMapping("/addStudent")
	public ResponseEntity<StudentList> addStudent(@RequestBody StudentList student) {
		StudentList savedStudent = studentService.saveStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
	}
}

