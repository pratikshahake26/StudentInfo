package com.assesment.sis.service;

import java.util.List;

import com.assesment.sis.repository.StudentListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.sis.entities.StudentList;

@Service
public class StudentService {
	
	@Autowired
	private StudentListRepository studentListRepository;

	public List<StudentList> getAllStudents()
	{
		return studentListRepository.findAll();
	}
	
	public StudentList getStudentById(int sid)
	{
	     return	studentListRepository.findById(sid).orElse(null);
	}

	public StudentList saveStudent(StudentList student) {
		return studentListRepository.save(student);
	}
}

