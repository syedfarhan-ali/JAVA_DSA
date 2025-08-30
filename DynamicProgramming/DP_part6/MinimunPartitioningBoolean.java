package DynamicProgramming.DP_part6;

public class MinimunPartitioningBoolean {
    public static boolean minPartition(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }

        int W = sum/2;
        int[][] dp = new int[n+1][W+1];

        // initialization
        // this is not needed in java as arrays are already initialized by 0.
        for (int i = 0; i < n+1; i++){
            for (int j = 0; j < W+1; j++){
                dp[i][j] = 0;
            }
        }

        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < W+1; j++){
                if (arr[i-1] <= j){// valid
                    dp[i][j] += Math.max(arr[i-1] + dp[i-1][j-arr[i-1]], dp[i-1][j]);
                } else { // invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        int sum1 = dp[n][W];
        int sum2 = sum-sum1;
        return sum1-sum2 == 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(minPartition(nums));
    }
}
