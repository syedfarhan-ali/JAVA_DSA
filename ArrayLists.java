import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.add(1,9);

        // System.out.println(list);

        // System.out.println(list.size());

        //print 
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }

        //get
        // int element = list.get(2);
        // System.out.println(element);

        //delete
        // list.remove(2);
        // System.out.println(list);

        //set
        // list.set(2, 10);
        // System.out.println(list);

        //contains
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(12));

        // System.out.println(list);
        // swapList(list, 1, 3);
        // System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(14);
        list2.add(3);
        list2.add(6);
        list2.add(66);
        list2.add(91);

        System.out.println(list2);
        Collections.sort(list2);//ascending
        System.out.println(list2);

        Collections.sort(list2, Collections.reverseOrder());//descending
        System.out.println(list2);
    }
    public static void swapList(ArrayList<Integer> list, int idx1, int idx2){

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

}
