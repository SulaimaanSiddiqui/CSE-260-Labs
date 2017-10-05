import java.util.*;
public class LinkedListPractice {

	public static void main(String[] args){
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		long currTime1 = System.currentTimeMillis();
		insert(arrayList);
		System.out.println("Time for insertion:/n ArrayList: "+ 
				(System.currentTimeMillis() - currTime1));	
		long currTime2 = System.currentTimeMillis();
		insert(linkedList);
		System.out.println("/n LinkedList: "+ 
				(System.currentTimeMillis() - currTime2));	
		
		long currTime3 = System.currentTimeMillis();
		getMany(arrayList);
		System.out.println("Time for getting indices:/n ArrayList: "+ 
				(System.currentTimeMillis() - currTime3));	
		long currTime4 = System.currentTimeMillis();
		getMany(linkedList);
		System.out.println("/n LinkedList: "+ 
				(System.currentTimeMillis() - currTime4));	
		
	}
	
	public static void insert(List<Integer> list){
		for(int i = 0; i < 5000; i++)
		{
			list.add(new Integer((int)(Math.random()*666+1)));
		}
	}
	
	public static <E extends Comparable<E>> void getMany(List<E> list){
		for(int i = 0; i < 500; i++){
			int randomPos = (int)(Math.random()*list.size());
			Collections.binarySearch(list, list.get(randomPos));
		}
	}
}
