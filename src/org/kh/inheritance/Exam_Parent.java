package org.kh.inheritance;

public class Exam_Parent {

	public static void main(String[] args) {
		Child child = new Child();
//		System.out.println(child.getParentMoney());
//		child.giveMoneyParent(1000);
//		System.out.println(child.getParentMoney());
		System.out.println(child.getMoney()); //class Parent �� getMoney ���п� ��Ӹ� ������ �޼ҵ带 �� �� ���� 
		child.printlnfo();
		
		Parent parent = new Parent();
		// parent.getMoney();
		System.out.println("toString() �������̵� : " + parent.toString());
	}
}

class Parent {
	//private int money = 2000;
	protected int money = 2000; // protected �� ��� �޴� �Ϳ� ���� ���ؼ� O

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() { //field�� �ִ� ���� ����ϴ� �뵵
		
		return this.money+""; // +"" => string�̿��� ���ڿ��� ���� 
	}
}

class Child extends Parent { // ��� �� extends ���
	
	private int myMoney = 1000;
	private int money = 1500;
	
	public Child () { // �⺻ ������
		super(); // super Ű����� �θ�ü ������ ȣ��
	}
	
	public int getParentMoney() {
		// return super.money;
		return super.getMoney();
	}

	public void giveMoneyParent(int extra) {
		int sum = super.getMoney() + extra;
		super.setMoney(sum);
	}
	public void printlnfo() {
		System.out.println(myMoney);
		System.out.println("�ڽ��� �� : " + this.money);
		System.out.println("�θ��� �� : " + super.money);
	}
}
