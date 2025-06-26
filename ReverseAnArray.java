public class ReverseAnArray {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[]){
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        printArr(nums);
        System.out.println();
        reverse(nums);
        printArr(nums);
    }
}
