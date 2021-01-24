package org.kh.inheritance;

public class Exercise_Super {
	// 정보처리기사 실기 시험 문제 (19년도)
	public static void main(String[] args) {

		SuperClass ex = new SubClass(); //상속관계에 있을 시에 작성하는 방법
										// SubClass ex = new SubClass(); 와 동일
		ex.paint();

	}
}

class SuperClass {
	void paint() {
		draw(); // 동적 바인딩 
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint(); // 부모의 paint() => Sub Object
		super.draw(); // 부모의 draw(). SuperClass의 draw를 출력시킴 => SuperObject
	}

	void draw() {
		System.out.println("Sub Object"); // 오버라이딩이 되어있음. 우선권
	}
}
