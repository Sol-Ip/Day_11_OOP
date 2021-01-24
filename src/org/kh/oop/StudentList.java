package org.kh.oop;

// 사용하지 않는 import 없애기
	// 또는 자동 import 하기 -> ctrl + shift + o
public class StudentList {
	private Student[] scores; 

	public StudentList() {

		// scores = new int[3]; // 0 0 0
		scores = new Student[3];
	}
	
	public void setStudent(Student[] scores) {
		this.scores=scores;
	}
	
		public Student [] getStudents() {
			return scores; 
		}
		
	}

