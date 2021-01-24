package org.kh.oop;

public class KHStudent extends Student {
	
	private int java; // �ڹ� ����
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	
	@Override // total()�� �������̵�
	public int total() { // �ڹ����� ������ �հ�
		return super.total()+java; // super.total() = �θ�(Student) Ŭ����
		
	}
	@Override
	public double avg() { // �ڹ����� ������ ���
		return (double)this.total()/4; // this.total()=�ڽ�(KH) Ŭ����
	}
}
