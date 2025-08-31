package SegmentTrees;

public class CreationOfST {
    static int[] tree;

    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildST(int[] arr, int i, int start, int end){
        if (start == end){
            tree[i] = arr[start];
            return;
        }

        int mid = start + (end-start)/2;
        buildST(arr, 2*i+1, start, mid); // left subtree
        buildST(arr, 2*i+2, mid+1, end); // right subtree
        tree[i] = tree[2*i+1] + tree[2*i+2];
        return;
    }
    public static void print(int[] tree){
        for (int j : tree) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);
        print(tree);
    }
}
