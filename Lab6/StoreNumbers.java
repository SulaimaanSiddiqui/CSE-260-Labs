import java.util.*;

public class StoreNumbers {

	private static LinkedList<Integer> list = new LinkedList<Integer>();
	
	public static void main(String[] args){
		if (args.length != 1) {
			System.out.println("e");
			System.exit(1);
		}
		String input = args[0];
		String[] inputList = input.split(" ");
		for(String s:inputList){
			if(!s.isEmpty())
				list.add(Integer.parseInt(s));
		}
		LinkedList<Integer> sortedInts = (LinkedList<Integer>)(list.clone());
		Collections.sort(sortedInts);
		System.out.println("Sorted List: " + sortedInts);
		
		LinkedList<Integer> shuffledInts = (LinkedList<Integer>)(list.clone());
		Collections.shuffle(shuffledInts);
		System.out.println("Shuffled List: " + shuffledInts);
		
		LinkedList<Integer> reversedInts = (LinkedList<Integer>)(list.clone());
		Collections.reverse(reversedInts);
		System.out.println("Sorted List: " + reversedInts);
	}
	
	
}
