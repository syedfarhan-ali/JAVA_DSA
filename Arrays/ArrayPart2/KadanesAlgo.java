public class KadanesAlgo {
    public static void subArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;

        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        //caclulate prefix sum arry
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];

                if(sum > maxSum){
                    maxSum = sum;
                }
                if(sum < minSum){
                    minSum = sum;
                }
            }
        }
        System.out.println("Max sum is : "+maxSum);
        System.out.println("Min sum is : "+minSum);
    }
    public static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Max sum is "+maxSum);
    }
    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(array);
    }
}


