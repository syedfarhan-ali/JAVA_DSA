import java.util.*;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if((input % 10)== 0){
                System.out.println("you entered a multiple of 10");
                break;
            }
            System.out.println(input);
            sc.close();
        }
    }
}
