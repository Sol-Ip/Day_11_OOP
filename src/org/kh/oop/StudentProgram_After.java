package org.kh.oop;

import java.util.Scanner;

public class StudentProgram_After { //������ ���α׷���
	
		// static int []scores = new int[3]; // �������� <- ��� �޼ҵ忡���� ���� ���� 
		
		public static void main(String[] args) {
		
			int[] scores = new int[3];
		
			���� : 
				while (true) {
				// F3 or ctrl + click
				// atl + ��
				int choice = showMenu();
	
				switch (choice) {
				
				case 1:
					insertScore(scores); //scores �� ���� ���� 
					break;
	
				case 2:
					printScore(scores);
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
		
					static int showMenu() {						
						Scanner sc = new Scanner(System.in);
						System.out.println("======= �л� ���� ���� ���α׷� =======");
						System.out.println("1. �л� ���� �Է�");
						System.out.println("2. �л� ���� ���");
						System.out.println("3. ���α׷� ����");
						System.out.print("���� : ");
						int choice = sc.nextInt();
						return choice;
	}
					
					static void insertScore(int[] scores) {		//�迭�� scores�� ���� ���� 				
						Scanner sc = new Scanner(System.in);
						for (int i = 0; i < scores.length; i++) {
							do { // while(scores[i] < 0 || scores[i]>100) ���� �ۼ��� ��� () �� ���� false�� ��
								System.out.print((i + 1) + "��° �л��� ���� : ");
								scores[i] = sc.nextInt();
								if (scores[i] < 0 || scores[i] > 100) {
									System.out.println("�Է� ������ ������ϴ�.");
								}
							} while (scores[i] < 0 || scores[i] > 100);
						} // �Է� ���� üũ �� �ݺ� ���� ����
					}
					
					static void printScore(int[] scores) { 
	
						//int[] scores = new int[3]; === ���� ���� 
						int sum = 0; // ���� ���� 
						System.out.println("<<�Է��� �л����� ����>>");
						for (int i = 0; i < scores.length; i++) {
							System.out.println((i + 1) + "��° �л��� ���� : " + scores[i]);
							sum += scores[i];
						}
						System.out.println("�л����� ���� �� �հ� : " + sum);
						System.out.printf("�л����� ��� ���� : %.2f\n", (double) sum / scores.length);
						 sum = 0; // �ٽ� �Է����� �� ������ �������� �ʵ��� ��
	
					}	
					
				}
				
				
	

				
				
			// ***** �޼ҵ� *****
			// �޴���� () {
			//System.out.println("======= �л� ���� ���� ���α׷� =======");
			//System.out.println("1. �л� ���� �Է�");
			//System.out.println("2. �л� ���� ���");
			//System.out.println("3. ���α׷� ����");
			//System.out.print("���� : ");
			//int choice = sc.nextInt();
			//
			// }
			// ���� �Է� () {
			//	 System.out.println("======= �л� ���� ���� ���α׷� =======");
			//	 System.out.println("1. �л� ���� �Է�");
			//	 System.out.println("2. �л� ���� ���");
			//	 System.out.println("3. ���α׷� ����");
			//	 System.out.print("���� : ");
			//	 int choice = sc.nextInt();
			// }
			// ���� ��� () {
			//System.out.println("<<�Է��� �л����� ����>>");
			//for (int i = 0; i < scores.length; i++) {
			//	System.out.println((i + 1) + "��° �л��� ���� : " + scores[i]);
			//	sum += scores[i];
			//}
			//System.out.println("�л����� ���� �� �հ� : " + sum);
			//System.out.printf("�л����� ��� ���� : %.2f\n", (double) sum / scores.length);
			//sum = 0; // �ٽ� �Է����� �� ������ �������� �ʵ��� ��
			//			// }