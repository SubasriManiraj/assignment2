package assignment2;

public class Calculator {
	public void additionTwoNumber(int a, int b) {
		System.out.println(a+b);
	}
	public void subtractionTwoNumber(int e, int f) {
		System.out.println(e-f);
	}
	public void multipleTwoNumber(double i, double j) {
		System.out.println(i*j);
	}
	public void divideTwoNumber(float x, float y) {
		System.out.println(x/y);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.additionTwoNumber(25, 35);
		cal.subtractionTwoNumber(999, 888);
		cal.multipleTwoNumber(85, 67);
		cal.divideTwoNumber(9840, 10);
	}

}
