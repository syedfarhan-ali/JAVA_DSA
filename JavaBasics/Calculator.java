public class Calculator{
    public static void main(String args[]){
        char operator = '&';
        int a = 10,b = 5;
        switch(operator){
            case '+' : System.out.println("A + B = "+ (a + b));
                break;
            case '-' : System.out.println("A - B = "+ (a - b));
                break;
            case '*' : System.out.println("A * B = "+ (a * b));
                break;
            case '/' : System.out.println("A / B = "+ (a / b));
                break;
            case '%' : System.out.println("A % B = "+ (a % b));
                break;
            default : System.out.println("Wrong operator");
        }
    }
}