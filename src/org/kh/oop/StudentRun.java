package org.kh.oop;

public class StudentRun {
	
	public static void main(String[]args) {
		StudentConsole sConsole = new StudentConsole();
		
		���� : 
			while (true) {
			// F3 or ctrl + click
			// atl + ��
			int choice = sConsole.showMenu();

			switch (choice) {

			case 1:
				sConsole.insertScore(); 
				break;

			case 2:
				sConsole.printScore();
				break;
				
			case 3:
				break ����;

			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
