import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        // while(num > 0){
        //     if(num == 0 || num == 1){
        //         System.out.println(fact);
        //         break;
        //     }
        //     fact = fact * num;
        //     num--;
        // }
        for(int i = 1;i <= num; i++){
            fact = fact * i;
        }
        
        System.out.println(fact);
        sc.close();
    }
}
