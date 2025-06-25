public class Butterfly {
    public static void butterfly(int n){
        //outer-top
        for(int i=1;i<=n;i++){
            //left-top wing - i
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //top space 2*(n-i)
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            
            //top-right wing - i
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //outer-bottom
        for(int i=1;i<=n;i++){
            //bottom-left wing - n-i+1
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            //bottom space - 2*(i-1)
            for(int k=1;k<=2*(i-1);k++){
                System.out.print("  ");
            }
            
            //bottom-right wing - n-i+1
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(4);
    }
}
