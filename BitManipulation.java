public class BitManipulation {
    public static void evenOddCheck(int num){
        if((num & 1) == 0){
            System.out.println("Number "+num+" is even");
        }else{
            System.out.println("Number "+num+" is odd");
        }
    }
    public static void getIthBit(int num , int i){
        int bitMask = 1<<i;
        if((num & bitMask) == 0){
            System.out.println(i);
        }else{
            System.out.println(i);
        }
    }
    public static int setIthBit(int num, int i){
        int bitMask = 1 << i;
        return num | bitMask;
    }
    public static int clearIthBit(int num, int i){
        int bitMask = ~(1 << i);
        return num & bitMask;
    }
    public static int updateIthBit(int num,int i,int newBit){
        // if(newBit == 0){
        //     return clearIthBit(num, i);
        // }else{
        //     return setIthBit(num, i);
        // }

        num = clearIthBit(num, i);
        int bitMask = newBit << i;
        return num | bitMask;
    }
    public static int clearIBits(int num,int i){
        int bitMask = (~0)<<i;
        return num & bitMask;
    }
    public static int clearBitsInRange(int num,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return num & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static int countSetBits(int n){
        int count = 0;
        while (n > 0) {
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans = 1;

        while (n>0) {
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println((5 & 6));//bitwise AND
        System.out.println((5 | 6));//bitwise OR
        System.out.println((5 ^ 6));//bitwise XOR
        System.out.println((~5));//bitwise one's compliment
        System.out.println((5 << 2));//left shift -> a << b = a* 2 to the power of b(a << b = a*2^b);
        //5 * 2^2 => 5 * 4 = 20
        System.out.println(6 >> 1);//right shift -> a >> b = a/2^b
        evenOddCheck(4);
        getIthBit(10, 2);
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15, 2));
        System.out.println(clearBitsInRange(10, 2, 4));
        System.out.println(isPowerOfTwo(8));
        System.out.println(countSetBits(15));
        System.out.println(fastExpo(5, 3));
    }
}
