package Hashing;
import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        System.out.println(lhm);

        //LinkedHashMaps are implemented using and Array of doublyLinkedLists
        //They give output in the order of the input
    }    
}
