package DynamicProgramming.DP_part6;

public class MatrixChainMultiplicationTabulation {
    public static int mcm(int[] arr, int i, int j){
        if (i == j){
            return 0; // single matrix case
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++){
            int cost1 = mcm(arr, i, k); // Ai.....Ak => arr[i-1] X arr[k]
            int cost2 = mcm(arr, k+1, j); // Ai+1.....Aj => arr[k] X arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(finalCost, ans);
        }

        return ans; // minCost
    }
    public static int mcmMemoization(int[] arr, int i, int j, int[][] dp){
        if (i == j){
            return 0;
        }

        if (dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++){
            int cost1 = mcmMemoization(arr, i, k, dp);
            int cost2 = mcmMemoization(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(finalCost, ans);
        }

        return dp[i][j] = ans;
    }
    public static int mcmTab(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n][n];

        // initialization
        for (int i = 0; i < n; i++){
                dp[i][i] = 0;
        }

        // bottom up
        for (int len = 2; len <= n-1; len++){
            for (int i = 1; i <= n-len; i++){
                int j = i + len - 1; // col
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j-1; k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    int totalCost = cost1 + cost2 + cost3;
                    dp[i][j] = Math.min(dp[i][j], totalCost);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }
    public static void print(int[][] dp){
        for (int[] ar : dp){
            for (int ele : ar) System.out.print(ele+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        System.out.println(mcmTab(arr));
    }
}
