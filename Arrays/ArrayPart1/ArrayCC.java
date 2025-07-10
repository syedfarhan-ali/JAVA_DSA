import java.util.Scanner;

public class ArrayCC {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] -= 50;
        }
    }
    public static void main(String[] args) {
        int marks[] = {99,98,100};
        // System.out.println("length of array : "+marks.length);
        Scanner sc = new Scanner(System.in); 
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
