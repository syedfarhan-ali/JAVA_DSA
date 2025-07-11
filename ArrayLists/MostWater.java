package ArrayLists;
import java.util.ArrayList;

public class MostWater {
    
    // brute force - O(n^2)
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;

    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int width = j-i;
    //             int currWater = ht * width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    //2 pointer approach - O(n)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int leftPtr = 0;
        int rightPtr = height.size()-1;

        while (leftPtr < rightPtr) {
            //calculate water area
            int ht = Math.min(height.get(leftPtr), height.get(rightPtr));
            int width = rightPtr-leftPtr;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //update pointer 
            if(height.get(leftPtr) < height.get(rightPtr)){
                leftPtr++;
            } else {
                rightPtr--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
