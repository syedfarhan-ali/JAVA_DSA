public class BinomialCoefficient {
    public static int fact(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static int binCoeff(int n,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_n_minus_r = fact(n-r);
        int ncr = fact_n/(fact_r * fact_n_minus_r);
        return ncr;
    }
    public static void main(String[] args) {
        int n = 5,r = 2;
        System.out.println(binCoeff(n, r));
    }
}
