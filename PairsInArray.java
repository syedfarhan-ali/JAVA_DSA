public class PairsInArray {
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10};
        int tp = 0;
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                break;
            }
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+tp);//n*(n-1)/2
    }
}
