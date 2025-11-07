package OperationsOnMaps;
import java.util.HashMap;
import java.util.Map;
public class SimpleMap {
    public static void main(String[] args){
        System.out.println("HAPPY 79TH INDEPENDENCE DAY");
        System.out.println("Meri BHARATH mahan");
        System.out.println("I love u INDIA");

        Map<Integer,Integer> map = new HashMap<>();
        map.put(7,0);
        map.put(4,2);
        map.put(7,1);
        map.put(2,3);
        map.put(8,4);
        map.put(9,5);
        System.out.println("Retrieves the value for the given key, or null if not found/n" + "The elemnt  found at the index"  + " " +map.get(7));

        //map.remove(key);
        // map.containsKey(key);
        // map.containsVaue(value);
        // map.size();
        // map.isEmpty();
        // map.clear();
        // map.putIfAbsent(key , value);
        System.out.println(map.keySet());
        // [2, 4, 7, 8, 9]
        //  Set<Integer> keys = map.keySet();

        System.out.println(map.values());
        // [3, 2, 1, 4, 5]
        // Collection<Integer> vals = map.values();


        System.out.println(map.entrySet());
        // [2=3, 4=2, 7=1, 8=4, 9=5]
        // for(Map.Entry<K,V> e : map.entrySet(){})

        Map<Integer , Integer> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println(map1);
        // {8=4, 9=5, 2=3, 4=2, 7=1}



    }

}
