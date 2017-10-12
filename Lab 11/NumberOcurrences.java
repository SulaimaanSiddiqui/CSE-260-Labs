import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOcurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        //int key;
        int key = (input.nextInt());
        while (key != 0){
            key = (input.nextInt());
            if(map.containsKey(key)) {
                Integer value = map.get(key);
                value++;
                map.put(key,value);
            }
            else if (!map.containsKey(key)){
                map.put(key, 1);
            }
        }
        int max = Collections.max(map.values());

        System.out.print("Highest numbers: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }


    }
}
