package GreedyAlgorithms;
import java.util.*;

public class MaxLenChainPairs {
    public static void main(String[] args) {//O(nlogn)
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i=0; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Maximun length of chain = "+chainLen);
    }
}
