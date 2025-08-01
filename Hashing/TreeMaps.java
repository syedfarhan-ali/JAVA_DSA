package Hashing;
import java.util.TreeMap;

public class TreeMaps {
    //TreeMaps are implemented using Red Black tree
    //They give output based on sorted order of key
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        System.out.println(tm);
    }
}
