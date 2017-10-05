import java.io.File;
import java.util.*;
public class dirSizeUsingStack {

	public static void main(String args[]){
	
		File f = new File("/Users/sulaimaan/Google Drive/MCAT");
		System.out.println(getSize(f));
		
	}
	
	public static long getSize(File directory){
		long size = 0;
		Stack<File> s = new Stack<File>();
		addFile(s, directory);
		while(!s.empty()){
			File f = s.pop();
			if(f.isDirectory())
				addFile(s,f);
			else
				size+=f.length();
		}
		return size;
	}
	
	public static void addFile(Stack<File> stack, File dir){
		for(File f: dir.listFiles()){
			stack.push(f);
		}
	}
	
}
