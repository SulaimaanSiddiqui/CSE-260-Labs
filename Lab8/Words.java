import java.util.*;
public class Words {

	public static void main(String[] args){
		Stack newStack = processString("in a hat who eats a cat");
		System.out.println(newStack);
		
	}
	
	public static Stack processString(String s){
		Stack stack = new Stack();
		String[] list = s.split(" ");
		for(String word:list){
			if(word.length() == 0)
				continue;
			else
				stack.push(word);
		}
		return stack;
	}
}
