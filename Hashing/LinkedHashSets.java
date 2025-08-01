package Hashing;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        //these maintain input order
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);
    }
}
