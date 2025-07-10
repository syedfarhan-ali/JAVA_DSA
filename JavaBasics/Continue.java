import java.util.*;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int input = sc.nextInt();
            if((input % 10) == 0){
                continue;
            }
            System.out.println(input);
        } while (true); 
    }
}
