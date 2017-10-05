
public class TestMyInteger {

	public static void main(String[] args){
		System.out.println("Test MyInteger");
		MyInteger tester = new MyInteger(13);
		System.out.println("Is odd: " + tester.isOdd());
		System.out.println("Is even: " + tester.isEven());
		System.out.println("Is prime: " + tester.isPrime());
		System.out.println("Equals 13: " + tester.equals(13));
		System.out.println(MyInteger.parseInt("1")+1);
	}
}
