package com.hb05.manytoone;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
public class Student05 {

	@Id
	private int id;
	
	
	@Column(name="student_name",nullable = false)
	private String name;
	
	private int grade;
	
	private LocalDateTime createOn;
	
	@ManyToOne
	//@JoinColumn(name="university_id")
	private University university;
	
	@PrePersist
	public void prePersist() {
		createOn=LocalDateTime.now();
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public LocalDateTime getCreateOn() { //set i ni sildik sadece ilk calistiginda olusturup 21. satira yerlestirisn
		return createOn;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student06 [id=" + id + ", name=" + name + ", grade=" + grade + ", createOn=" + createOn
				+ ", university=" + university + "]";
	}
	
	
	
	
}