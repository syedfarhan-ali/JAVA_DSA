package DynamicProgramming.DP_part2;

public class TargetSumTabulation {
    public static boolean targetSumSubSet(int[] arr, int sum){// O(n * sum)
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        //i = items & j = target sum
        for(int i = 0; i < n+1; i++){
            dp[i][0] = true;
        }

        //tabulation
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum+1; j++){
                int v = arr[i-1];
                //include
                if (v <= j && dp[i-1][j-v] == true) {
                    dp[i][j] = true;
                }
                //exclude
                else if (dp[i-1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }

        print(dp);
        return dp[n][sum];
    }

    public static void print(boolean[][] dp){
        for (boolean[] ba : dp) {
            for (boolean ele : ba) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {4,2,7,1,3};
        int targetSum = 10;

        System.out.println(targetSumSubSet(numbers, targetSum));
    }
}