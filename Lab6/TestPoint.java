import java.util.*;
public class TestPoint {
	public static void main(String[] args) {

		Point[] points = new Point[100];
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point((double)(Math.random() * 5),
				(double)(Math.random() * 5));
		}


		Arrays.sort(points);
		List<Point> list1 = Arrays.asList(points);
		System.out.println("\nPoints in increasing order of their x-coordinates:");
		System.out.println(list1);
		
		

		Arrays.sort(points, new CompareY());
		List<Point> list2 = Arrays.asList(points);
		System.out.println("\nPoints in increasing order of their y-coordinates:");
		System.out.println(list2);
	}
}