public class PrimeChecker2 {
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
        int n = 5;
        if(isPrime(n)){
            System.out.println(n+" is a prime");
        }else{
            System.out.println(n+" is not a prime");
        }
    }
}
