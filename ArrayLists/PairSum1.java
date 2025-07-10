package ArrayLists;
import java.util.ArrayList;

public class PairSum1 {
    //brute force
    // public static boolean pairSum(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i)+list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2 pointer approach
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        
        while (lp < rp) {
            int currSum = list.get(rp)+list.get(lp);
            if(currSum == target){
                return true;
            } 
            else if(currSum > target){
                rp--;
            }
            else{
                lp++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 6;
        
        System.out.println(pairSum(list, target));
    }
}
