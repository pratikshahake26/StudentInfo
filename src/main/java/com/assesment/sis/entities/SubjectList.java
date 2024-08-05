package com.assesment.sis.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "subjectlist")
public class SubjectList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

	private String subject_name;
    private int s_credit;
    private boolean s_type;
    private int s_theory;
    private int s_lab;
    private int sinternal;
    private int s_endsem;
    private int practical;
    private String professor;
    
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getSid() {
		return sid;
	}
	public void setsid(int cid) {
		this.sid = cid;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String course_name) {
		this.subject_name = course_name;
	}
	public int getS_credit() {
		return s_credit;
	}
	public void setS_credit(int c_credit) {
		this.s_credit = c_credit;
	}
	public boolean isS_type() {
		return s_type;
	}
	public void setS_type(boolean c_type) {
		this.s_type = c_type;
	}
	public int getS_theory() {
		return s_theory;
	}
	public void setS_theory(int c_theory) {
		this.s_theory = c_theory;
	}
	public int getS_lab() {
		return s_lab;
	}
	public void setS_lab(int c_lab) {
		this.s_lab = c_lab;
	}
	public int getSinternal() {
		return sinternal;
	}
	public void setSinternal(int cinternal) {
		this.sinternal = cinternal;
	}
	public int getS_endsem() {
		return s_endsem;
	}
	public void setS_endsem(int c_endsem) {
		this.s_endsem = c_endsem;
	}
	public int getPractical() {
		return practical;
	}
	public void setPractical(int practical) {
		this.practical = practical;
	}
	
	public String getS_typeString() {
        return s_type ? "Core" : "Elective";
    }
	public String getS_SubjectID() {
        return "STBTCSE P" + sid;
    }
	public SubjectList(int cid) {
		super();
		this.sid = cid;
	}
	public SubjectList() {
		super();
		// TODO Auto-generated constructor stub
	}

} 
