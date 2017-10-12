import java.io.File;
import java.util.*;

public class Letters {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file");
        File f = new File(scan.nextLine());
        Scanner input = new Scanner(f);
        Character[] list = {'A' , 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        List<Character> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(list));
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.addAll(list1);

        int vcount = 0;
        int ccount = 0;

        while(input.hasNext()){
            String[] words = input.nextLine().split(" ");
            for (String s:words) {
                if(s.length() > 0)
                    for (char c:s.toCharArray()) {
                        if(vowels.contains(c))
                            vcount++;
                        else
                            ccount++;
                    }
            }
        }

        System.out.println("Vowel count: " + vcount);
        System.out.println("Consonant count: " + ccount);
    }
}
