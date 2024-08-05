package com.assesment.sis.service;

import java.util.List;

import com.assesment.sis.entities.SubjectList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.sis.repository.SubjectListRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectListRepository subjectListRepository;
	
	public List<SubjectList> getAllSubjects()
	{
		return subjectListRepository.findAll();
	}
	
	public SubjectList getSubjectBy(int cid)
	{
		return subjectListRepository.findById(cid).orElse(null);
	}

	public SubjectList saveStudent(SubjectList subject) {
		return subjectListRepository.save(subject);
	}
}
