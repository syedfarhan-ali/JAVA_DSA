public class SumOfN {
    public static int sumOfNums(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = sumOfNums(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        int sum = sumOfNums(5);
        System.out.println(sum);
    }
}
