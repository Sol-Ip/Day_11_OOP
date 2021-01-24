package org.kh.oop;

import java.util.Scanner;

public class StudentConsole {

	private StudentList sList = new StudentList();

	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 학생 성적 관리 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void insertScore() {

		Scanner sc = new Scanner(System.in);
		Student[] scores = new Student[3];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new Student(); // 중요 !! 3개의 공간 중 1개씩 공간에 입력을 한다
			System.out.println((i + 1) + "번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String studentName = sc.next();
			scores[i].setName(studentName);
			System.out.print("국어 점수 입력 : ");
			int kor = sc.nextInt();
			scores[i].setKor(kor);
			System.out.print("영어 점수 입력 : ");
			int eng = sc.nextInt();
			scores[i].setEng(eng);
			System.out.print("수학 점수 입력 : ");
			int math = sc.nextInt();
			scores[i].setMath(math);

		}
		sList.setStudent(scores);
	}

	public void printScore() {

		Student[] scores = sList.getStudents();

		System.out.println("<<입력한 학생들의 성적>>");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i].getName() + "학생의 성적");
			System.out.println(" 학생의 국어 성적 : " + scores[i].getKor());
			System.out.println(" 학생의 영어 성적 : " + scores[i].getEng());
			System.out.println(" 학생의 수학 성적 : " + scores[i].getMath());
			System.out.println(" 학생의 점수 총합 : " + scores[i].total());
			System.out.printf(" 학생의 평균 : %.2f \n", scores[i].avg());
			System.out.println("=========================");

		}
	}
}
