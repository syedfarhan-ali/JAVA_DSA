public class BinaryToDecimal {
    public static void binToDec(int n){
        int decimal = 0;
        int power = 0;
        while (n>0) {
            decimal = decimal + (n % 10*(int)Math.pow(2, power));
            power++;
            n = n/10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        int n = 111;
        binToDec(n);
    }
}
