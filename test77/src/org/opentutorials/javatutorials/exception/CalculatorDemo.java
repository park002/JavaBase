package org.opentutorials.javatutorials.exception;

class Calculator {
	int left, right; // 전역변수

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
///ㅁㅁ
	}

	public void divide() { // 인스턴스메소드
		try {
			// 계산 결과는
			// 오류발생 원인=>/ by zero

			System.out.println("계산 결과는");
			System.out.println(this.left / this.right);
			System.out.println("입니다");
		} catch (Exception e) {
			System.out.println("\n 오류: e.getMessage()=>" + e.getMessage());
			System.out.println("\n 오류 : e.toString()=>"+ e.toString());
			System.out.println("\n 오류 : e.printStackTrace()=>");
			e.printStackTrace();
			
		}
		System.out.println("divide() end");
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();

	}

}
