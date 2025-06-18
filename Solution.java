import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Q1
       
        float a,b,c;
        int n = 3;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        float avg = (a+b+c)/n;
        System.out.println("Average is : " + avg);
    

        //Q2  
      
        float side;
        side = sc.nextFloat();
        System.out.println(side*side);
    
        //Q3
           
        float pencil,pen,eraser;
        pencil = sc.nextFloat();    
        pen = sc.nextFloat();    
        eraser = sc.nextFloat();
        float total = pencil+pen+eraser;    
        float gst = total   + (0.18f*total);
        System.out.println("Total cost : " + total);
        System.out.println("Total cost with 18% GST: " + (total+gst));
    
        //Q4 -> Boolean

        //Q5

        int $ = 24;
        System.out.println($);
    }
}