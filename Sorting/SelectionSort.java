public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int smallestPos = turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[j] < arr[smallestPos]){
                    smallestPos = j;
                }
            }
            //swap
            int temp = arr[smallestPos];
            arr[smallestPos] = arr[turn];
            arr[turn] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
