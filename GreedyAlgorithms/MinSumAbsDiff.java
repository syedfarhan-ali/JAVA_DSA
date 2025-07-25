package GreedyAlgorithms;
import java.util.*;

public class MinSumAbsDiff {
    public static void main(String[] args) { //O(nlogn)
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimun absolute difference of pairs = "+minDiff);
    }
    
}
