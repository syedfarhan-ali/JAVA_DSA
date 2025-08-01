package Hashing;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        //these are sorted in ascending order
        //null values are not allowed
        //O(logn)

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);
    }
}
