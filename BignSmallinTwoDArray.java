public class BignSmallinTwoDArray {
    public static void find(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("max value is : "+max);
        System.out.println("min value is : "+min);
    }
    public static void main(String[] args) {
        int arr[][] = {{2,1,5},{9,30,1},{-8,1,0}};
        find(arr);
    }
}
