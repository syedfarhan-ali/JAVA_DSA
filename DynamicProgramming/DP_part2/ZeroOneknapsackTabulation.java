package DynamicProgramming.DP_part2;

import java.util.Arrays;

public class ZeroOneknapsackTabulation {
    public static int knapsack(int[] val, int[] wt, int W, int n, int[][] dp){
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n-1] <= W) { // valid
            // include
            int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1, dp);

            // exclude
            int ans2 = knapsack(val, wt, W, n-1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else { // not valid
            dp[n][W] = knapsack(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }

    public static void print(int[][] dp){
        for (int[] row : dp) {
            for (int ele : row) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    public static int knapsackTablutation(int[] val, int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) { // 0th col
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // 0th row
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int v = val[i-1]; // ith item val
                int w = wt[i-1]; // ith item wt

                if (w <= j) { // valid
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        int[][] dp = new int[val.length+1][W+1];

        // initializing the array with -1 value
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        // System.out.println(knapsack(val, wt, W, val.length, dp));

        System.out.println(knapsackTablutation(val, wt, W));
    }
}
