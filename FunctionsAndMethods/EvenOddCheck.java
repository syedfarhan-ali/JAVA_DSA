public class EvenOddCheck {
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 1;
        if(isEven(num)){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
}
