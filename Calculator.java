package week2.day4;


public class Calculator {
	public int add(int  a,int  b) {
		int c=a+b;
		return c;
	
	}
	public void sub(int add, int b) {
		int c =add-b;
		System.out.println(c);
		
	}
	public void multiply(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	public void divide(float a,float b) {
		// TODO Auto-generated method stub
     float c=a/b;
     System.out.println(c);
	}
	
public static void main(String[] args) {
	Calculator calc=new Calculator();
	int add = calc.add(10, 20);
	System.out.println(add);
	calc.sub(50, add);
	calc.multiply(67, 90);
	calc.divide(67, 45);
	
}
	

}
