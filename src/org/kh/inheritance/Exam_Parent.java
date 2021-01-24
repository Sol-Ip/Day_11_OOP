package org.kh.inheritance;

public class Exam_Parent {

	public static void main(String[] args) {
		Child child = new Child();
//		System.out.println(child.getParentMoney());
//		child.giveMoneyParent(1000);
//		System.out.println(child.getParentMoney());
		System.out.println(child.getMoney()); //class Parent 내 getMoney 덕분에 상속만 받으면 메소드를 쓸 수 있음 
		child.printlnfo();
		
		Parent parent = new Parent();
		// parent.getMoney();
		System.out.println("toString() 오버라이딩 : " + parent.toString());
	}
}

class Parent {
	//private int money = 2000;
	protected int money = 2000; // protected 는 상속 받는 것에 의해 한해서 O

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() { //field에 있는 값을 출력하는 용도
		
		return this.money+""; // +"" => string이여서 문자열로 만듦 
	}
}

class Child extends Parent { // 상속 시 extends 사용
	
	private int myMoney = 1000;
	private int money = 1500;
	
	public Child () { // 기본 생성자
		super(); // super 키워드로 부모객체 생성자 호출
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
		System.out.println("자식의 것 : " + this.money);
		System.out.println("부모의 것 : " + super.money);
	}
}
