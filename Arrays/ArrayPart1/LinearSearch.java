public class LinearSearch {
    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16};
        int target = 10;
        System.out.println("The index of "+target+" is "+linearSearch(array,target));
    }
}
