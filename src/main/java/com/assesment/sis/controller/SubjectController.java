package com.assesment.sis.controller;

import java.util.List;

import com.assesment.sis.entities.StudentList;
import com.assesment.sis.entities.SubjectList;
import com.assesment.sis.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.assesment.sis.repository.SubjectListRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class SubjectController {
	
	@Autowired
	private SubjectListRepository subjectListRepository;
	@Autowired
	private SubjectService subjectService;

	@GetMapping("/subjectList")
	public ResponseEntity<List<SubjectList>> getAllSubjects(){
		List<SubjectList> subjects = subjectService.getAllSubjects();
		return ResponseEntity.ok(subjects);
	}
	@PostMapping("/addSubject")
	public ResponseEntity<SubjectList> addSubject(@RequestBody SubjectList subject) {
		SubjectList savedSubject = subjectService.saveStudent(subject);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedSubject);
	}

}
 