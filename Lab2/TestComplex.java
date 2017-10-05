import java.util.*;
public class TestComplex {

	public static void main(String[] args){
		
		System.out.println("Test Complex");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter complex number: ");
		System.out.println("a: ");
		int a = scan.nextInt();
		System.out.println("b: ");
		int b = scan.nextInt();
		Complex c1 = new  Complex(a,b);
		System.out.println("c: ");
		int c = scan.nextInt();
		System.out.println("d: ");
		int d = scan.nextInt();
		Complex c2 = new  Complex(c,d);
		System.out.println("Add: " + c1.add(c2));
		System.out.println("Subtract: " + c1.subtract(c2));
		System.out.println("Multiply: " + c1.multiply(c2));
		System.out.println("Divide: " + c1.divide(c2));
	}
	
}
