package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSets {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // //Way - 1 [using Iterator]
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //Way - 2 [using foreach loop]
        for(String city : cities){
            System.err.println(city);
        }
    }
}
