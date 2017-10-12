import java.io.File;
import java.util.*;

public class WordOccurence implements Comparable<WordOccurence> {
    String word;
    Integer count;

    public WordOccurence(String word, int count){
        this.word = word;
        this.count = count;
    }

    @Override
    public int compareTo(WordOccurence o) {
        return o.count.compareTo(count);
    }

    @Override
    public String toString() {
        return  word + ": " + count;
    }

    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file");
        File f = new File(scan.nextLine());
        Scanner input = new Scanner(f);
        Map<String, Integer> map = new HashMap<>();

        while(input.hasNext()){
        String[] words = input.next().split("[ \n\t\r.,;:!?()]");
        for (String word: words) {
            String key = word.toLowerCase();
            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        }


        ArrayList<WordOccurence> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: map.entrySet())
            list.add(new WordOccurence(entry.getKey(), entry.getValue()));


        Collections.sort(list);


        System.out.println(list);
    }
}
