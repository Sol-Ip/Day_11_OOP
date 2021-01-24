package org.kh.oop;
 // 캡슐화 (필드 - 메소드)
public class Student {
	private String name; // 접근을 못 하게 해야 data 지킴
	private int kor;
	private int eng;
	private int math;
	
	// 기본 생성자 
	public Student() {} // 매개변수 있는 생성자를 만들 때 무조건 기본 생성자를 만들어야함.
	
	// 매개변수 있는 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// *** getter 와 setter 메소드 ***
	
	// setter 메소드 - 필드에 값 저장
	public void setName(String name) {
		this.name=name; // 4번줄 필드에 대입, this 의미는 field에 저장된 매개변수를 강조+의미
	}
	// getter 메소드 - 필드에 저장된 값 로드
	public String getName() {
		return name; // 
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public int getMath() {
		return math;
	}
	public int total () { // 합계
		int sum = kor+eng+math;
		return sum;
	}
	public double avg() {
		return (double)this.total()/3 ;
	}
	@Override
	public String toString() {
		return "name : " + this.name + "kor : "+this.kor+"eng : "+this.eng+"math : "+this.math;
	}
}
