public class GridWays {
    //we can also solve this in linear time using
    //Permutation formula (n-1 + m-1)!/(n-1)!*(m-1)! [! = factorial] 
    public static int gridWays(int i, int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1){
            return 1;
        } else if(i == n || j == m){//boundry cross condition
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 2, m = 3;    
        System.out.println(gridWays(0, 0, n, m));
    }
}
