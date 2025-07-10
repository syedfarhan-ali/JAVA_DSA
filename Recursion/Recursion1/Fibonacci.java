public class Fibonacci {
    public static int Fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibN = Fibo(n - 1) + Fibo(n - 2);
        return fibN;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fibo(n));
    }
}
