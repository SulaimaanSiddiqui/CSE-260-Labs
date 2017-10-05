
public class TestMyPoint {
	
	public static void main(String[] args){
		System.out.println("Test MyPoint");
		MyPoint tester = new MyPoint(0,0);
		MyPoint tester2 = new MyPoint(10,30.5);
		System.out.println("Distance: " + tester.distance(tester2));
	}
}
