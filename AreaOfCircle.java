import java.util.*;

public class AreaOfCircle{
    public static void main(String args[]){
        //pie*r^2 | pie = 3.14;
        Scanner sc = new Scanner(System.in);
        float pie = 3.14f;
        float r = sc.nextFloat();
        float area = pie * r * r;
        System.out.println(area); 
    }
}