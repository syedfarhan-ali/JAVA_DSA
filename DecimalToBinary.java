public class DecimalToBinary {
    public static void decToBin(int n){
        int binary = 0;
        int power = 0;
        while(n>0){
            binary = binary + n%2 * (int)Math.pow(10,power);
            n = n/2;
            power++;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        decToBin(7);
    }
}
