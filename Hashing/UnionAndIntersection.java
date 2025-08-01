package Hashing;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        //union = 6 (7,3,9,6,2,4)[order doesn't matter]
        //intersection = 2 (3,9)[order doesn't matter]

        HashSet<Integer> set = new HashSet<>();

        //Union
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("union = "+set.size());
        for(Integer ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Intersection
        set.clear();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println();
        System.out.println("Intersection = "+count);
    }
}
