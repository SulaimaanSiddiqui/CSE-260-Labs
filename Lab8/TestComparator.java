import java.util.*;
public class TestComparator {

	public static void main(String[] args){
		StringComparator s = new StringComparator();
		//System.out.println(s.compare("banana", "chicken"));
		List list = Arrays.asList("a","b","c","d","e","f");
		Collections.sort(list, s);
		System.out.println(list);
		PriorityQueue<String> queue = new PriorityQueue<String>(s);
		queue.addAll(list);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
	}
}
