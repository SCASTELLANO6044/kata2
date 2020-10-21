package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int data [] = {1,5,2,6,9,8,5,36,9,4,1,5,7,77,85};
        Map<Integer,Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key:data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        
    }
    
}
