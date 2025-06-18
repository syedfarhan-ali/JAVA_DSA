public class PrintLargestOf3{
    public static void main(String args[]){
        int a = 10,b = 100,c = 100;
        if((a >= b) && (a >= c)){
            System.out.println("A is largest "+a);
        }else if(b >= c){
            System.out.println("B is largest "+b);
        }else{
            System.out.println("C is largest "+c);
        }
    }
}