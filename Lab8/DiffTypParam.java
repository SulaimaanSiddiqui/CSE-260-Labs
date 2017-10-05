import java.util.*;
public class DiffTypParam {

	public static void main(String[] args){
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(Arrays.asList(1,2,3,4,5));
		System.out.println(n);
		shuffle(n);
		System.out.println(n);
		shuffle(n,-1);
		System.out.println(n);
	}
	
	public static <E extends Comparable<E>> void shuffle(ArrayList<E> list){
		Collections.shuffle(list);
	}
	
	public static void shuffle(ArrayList<? extends Comparable> list, int d){
		Collections.shuffle(list);
	}
}
