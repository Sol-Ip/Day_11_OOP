package net.kh.member.controller.Run;

import org.kh.oop.Student;

public class Run {
	public static void main(String[]args) {

//		System.out.println();
//		System.out.println("���ڿ�");
//		System.out.println(4);
//		System.out.println(3.14);
		System.out.println("=====�⺻ ������=====");
		Student student = new Student();
		student.setName("ȫ�浿");
		student.setKor(100);
		student.setEng(100);
		student.setMath(100);
		System.out.println(student.getName() +","+student.getKor()+","+student.getEng()+","+student.getMath());
	
		System.out.println();
		
		System.out.println("=====�Ű����� �ִ� ������=====");
		Student student2 = new Student("ȫ�浿",100,100,100);
		System.out.println(student2.getName() +","+student2.getKor()+","+student2.getEng()+","+student2.getMath());
	}
}
