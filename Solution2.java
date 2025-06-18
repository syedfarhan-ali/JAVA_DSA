import java.util.*;

public class Solution2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Q1
        /*
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println("Positive number.");
        }else{
            System.out.println("Negative number.");
        }
        */
        //Q2
        /*
        double temp = 103.5;
        if(temp >= 100){
            System.out.println("You have fever rest pls");
        }else{
            System.out.println("You don't have fever go to school");
        }
        */
        //Q3
        /*
        int weekDay = sc.nextInt();
        switch(weekDay){
            case 1 : System.out.println("Monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            case 4 : System.out.println("Thursday");
                break;
            case 5 : System.out.println("Friday");
                break;
            case 6 : System.out.println("Saturday");
                break;
            case 7 : System.out.println("Sunday");
                break;
            default : System.out.println("Wrong input");
        }
        */
       //Q4
       //x = false,y = 63
       //Q5
       int year = sc.nextInt();

       boolean x = (year % 4) == 0;
       boolean y = (year % 100) != 0;
       boolean z = (year % 100 == 0) && (year % 400 == 0);


       if(x && (y || z)){
            System.out.println(year+" is a leap year.");
       }else{
            System.out.println(year+" is not a leap year.");
       }
    }
}