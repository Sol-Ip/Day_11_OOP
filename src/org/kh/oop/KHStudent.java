package org.kh.oop;

public class KHStudent extends Student {
	
	private int java; // 자바 점수
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	
	@Override // total()을 오버라이딩
	public int total() { // 자바점수 포함한 합계
		return super.total()+java; // super.total() = 부모(Student) 클래스
		
	}
	@Override
	public double avg() { // 자바점수 포함한 평균
		return (double)this.total()/4; // this.total()=자식(KH) 클래스
	}
}
