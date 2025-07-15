package GreedyAlgorithms;

import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};//m-1
        Integer costHor[] = {4, 1, 2};//n-1

        //Sorting both in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        //h -> current horizontal cut
        //v -> current vertical cut
        int h = 0, v = 0;

        //horizontal and vertical piece count
        int hp = 1, vp = 1;

        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            //vertical cost < horizontal cost
            if(costVer[v] <= costHor[h]){
                //horizontal cut because costHor[h] is greater
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                //vertical cut since condition of horizontal is greater became false
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimun cost of cuts : "+cost);
    }
}
