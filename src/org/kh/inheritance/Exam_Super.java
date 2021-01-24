package org.kh.inheritance;

public class Exam_Super {
	public static void main(String[]args) {
		Sub sub = new Sub();
		sub.print();
	}
}
class Super {
	protected int money = 1000;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void print() {
		System.out.println("나는 부모의 print().");
	}
}

class Sub extends Super {
	@Override
	public void print() {
		System.out.println("나는 자식의 print()."); // 우선권을 가져 해당 문자열이 출력
	}
}
