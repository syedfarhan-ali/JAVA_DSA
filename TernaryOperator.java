public class TernaryOperator{
    public static void main(String args[]){
        // variable = condition?statement1:statement2;
        int larger = (5>3)?5:3;

        String type = (5 % 2 == 0)?"even":"odd";

        int marks = 32;
        String result =(marks >= 33)?"pass":"fail"; 
        System.out.println(larger);
        System.out.println(type);
        System.out.println(result);
    }
}