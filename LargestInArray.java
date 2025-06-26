public class LargestInArray {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println(" Smallest value is : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int array[] = {1,2,6,3,5};
        int largest = largest(array);
        System.out.println(" Largest value is : "+largest);
    }
}
