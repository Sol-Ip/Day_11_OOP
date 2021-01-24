package org.kh.inheritance;

public class Exercise_Super {
	// ����ó����� �Ǳ� ���� ���� (19�⵵)
	public static void main(String[] args) {

		SuperClass ex = new SubClass(); //��Ӱ��迡 ���� �ÿ� �ۼ��ϴ� ���
										// SubClass ex = new SubClass(); �� ����
		ex.paint();

	}
}

class SuperClass {
	void paint() {
		draw(); // ���� ���ε� 
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint(); // �θ��� paint() => Sub Object
		super.draw(); // �θ��� draw(). SuperClass�� draw�� ��½�Ŵ => SuperObject
	}

	void draw() {
		System.out.println("Sub Object"); // �������̵��� �Ǿ�����. �켱��
	}
}
