public class Power {
    public static int pow(int num,int power){
        if(power == 1){
            return num;
        }
        int result = num * pow(num,power - 1);
        return result;
    }
    public static void main(String[] args) {
        int x = 2;
        int power = 10;
        System.out.println(pow(x,power));
    }
}
