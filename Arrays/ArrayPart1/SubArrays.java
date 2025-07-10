public class SubArrays {
    public static void subArray(int arr[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                ts++;
                System.out.println("sum is : "+sum);
                if(sum > maxSum){
                    maxSum = sum;
                }
                if(sum < minSum){
                    minSum = sum;
                }
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Total subarrays : "+ts);//n*(n+1)/2
        System.out.println("Max sum is : "+maxSum);
        System.out.println("Min sum is : "+minSum);
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        subArray(array);
    }
}
