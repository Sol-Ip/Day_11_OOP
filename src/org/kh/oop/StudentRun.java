package org.kh.oop;

public class StudentRun {
	
	public static void main(String[]args) {
		StudentConsole sConsole = new StudentConsole();
		
		종료 : 
			while (true) {
			// F3 or ctrl + click
			// atl + ←
			int choice = sConsole.showMenu();

			switch (choice) {

			case 1:
				sConsole.insertScore(); 
				break;

			case 2:
				sConsole.printScore();
				break;
				
			case 3:
				break 종료;

			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
