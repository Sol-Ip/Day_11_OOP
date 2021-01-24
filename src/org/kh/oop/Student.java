package org.kh.oop;
 // ĸ��ȭ (�ʵ� - �޼ҵ�)
public class Student {
	private String name; // ������ �� �ϰ� �ؾ� data ��Ŵ
	private int kor;
	private int eng;
	private int math;
	
	// �⺻ ������ 
	public Student() {} // �Ű����� �ִ� �����ڸ� ���� �� ������ �⺻ �����ڸ� ��������.
	
	// �Ű����� �ִ� ������
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// *** getter �� setter �޼ҵ� ***
	
	// setter �޼ҵ� - �ʵ忡 �� ����
	public void setName(String name) {
		this.name=name; // 4���� �ʵ忡 ����, this �ǹ̴� field�� ����� �Ű������� ����+�ǹ�
	}
	// getter �޼ҵ� - �ʵ忡 ����� �� �ε�
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
	public int total () { // �հ�
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
