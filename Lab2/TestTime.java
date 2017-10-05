
public class TestTime {

	public static void main(String[] args){
		Time t1 = new Time();
		System.out.println("Time 1\nHour: " + t1.getHours() +
				"\nMin: " + t1.getMin() + "\nSec: " + t1.getSec());
		Time t2 = new Time(555550000);
		System.out.println("\nTime 2\nHour: " + t2.getHours() +
				"\nMin: " + t2.getMin() + "\nSec: " + t2.getSec());
	}
	
}
