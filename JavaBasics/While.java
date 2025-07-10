import java.util.*;

public class While{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count <= n){
            System.out.print(count + " ");
            sum+=count;
            count++;
        }
            System.out.print("Sum is : "+sum);
            sc.close();
    }
}