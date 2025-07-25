public class PrintAllPrimesToN {
    public static void printPrime(int n){
            for(int i=2;i<=n;i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }else{
                    continue;
                }
            }
    }
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 10000000;
        printPrime(n);
    }
}
