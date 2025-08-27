package DynamicProgramming.DP_part4;

public class StringConversion {
    // convert String1 to String2 with only insertion & deletion.
    // print number of deletions & insertions
    public static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];

        // initialilze
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < m+1; i++) {
            dp[0][i] = 0;
        }

        // bottom up
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<m+1; j++){
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }
    public static int stringCon(String str1, String str2){
        int lcs = lcs(str1, str2);
        int diffStr1 = Math.abs(str1.length() - lcs);
        int diffStr2 = Math.abs(str2.length() - lcs);
        System.out.println("Number of Deletions : "+diffStr1);
        System.out.println("Number of Insertions : "+diffStr2);

        return diffStr1 + diffStr2;
    }
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";

        System.out.println("Total number of operations : "+stringCon(str1, str2));
    }
}
