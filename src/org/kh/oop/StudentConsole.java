package org.kh.oop;

import java.util.Scanner;

public class StudentConsole {

	private StudentList sList = new StudentList();

	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= �л� ���� ���� ���α׷� =======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���α׷� ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void insertScore() {

		Scanner sc = new Scanner(System.in);
		Student[] scores = new Student[3];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new Student(); // �߿� !! 3���� ���� �� 1���� ������ �Է��� �Ѵ�
			System.out.println((i + 1) + "��° �л� ���� �Է�");
			System.out.print("�л� �̸� �Է� : ");
			String studentName = sc.next();
			scores[i].setName(studentName);
			System.out.print("���� ���� �Է� : ");
			int kor = sc.nextInt();
			scores[i].setKor(kor);
			System.out.print("���� ���� �Է� : ");
			int eng = sc.nextInt();
			scores[i].setEng(eng);
			System.out.print("���� ���� �Է� : ");
			int math = sc.nextInt();
			scores[i].setMath(math);

		}
		sList.setStudent(scores);
	}

	public void printScore() {

		Student[] scores = sList.getStudents();

		System.out.println("<<�Է��� �л����� ����>>");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i].getName() + "�л��� ����");
			System.out.println(" �л��� ���� ���� : " + scores[i].getKor());
			System.out.println(" �л��� ���� ���� : " + scores[i].getEng());
			System.out.println(" �л��� ���� ���� : " + scores[i].getMath());
			System.out.println(" �л��� ���� ���� : " + scores[i].total());
			System.out.printf(" �л��� ��� : %.2f \n", scores[i].avg());
			System.out.println("=========================");

		}
	}
}
