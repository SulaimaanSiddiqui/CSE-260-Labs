import java.util.*;

public class ClonePriorityQueue<E> extends PriorityQueue<E> implements java.lang.Cloneable {
	
  public Object clone() throws CloneNotSupportedException {
      ClonePriorityQueue<E> queue = new ClonePriorityQueue<E>();      
      for (E e: this) {
        queue.offer(e);
      }
      return queue;
  }
  
  public static void main(String[] args) throws Exception {
    ClonePriorityQueue<String> queue = new ClonePriorityQueue<String>();
    queue.offer("red");
    queue.offer("green");
    queue.offer("yellow");
    
  ClonePriorityQueue<String> queue1=(ClonePriorityQueue<String>)(queue.clone());
    
    System.out.print(queue1);
  }

}
