package org.kh.oop;

// ������� �ʴ� import ���ֱ�
	// �Ǵ� �ڵ� import �ϱ� -> ctrl + shift + o
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

