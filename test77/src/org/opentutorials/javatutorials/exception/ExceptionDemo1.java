package org.opentutorials.javatutorials.exception;

class A {
	private int[] arr = new int[3];
	 A() { //생성자 =클래스 이름과 메소드 이름이 같은 것 
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void z(int first, int second) {
		System.out.println(arr[first] / arr[second]);
	}
}
public class ExceptionDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.z(10, 1);
	}

}
