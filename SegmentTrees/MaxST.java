package SegmentTrees;

public class MaxST {
    static int[] tree;

    public static void init(int n){
        tree = new int[4*n];
    }
    public static void buildST(int i, int si, int sj, int[] arr){
        if (si == sj){
            tree[i] = arr[si];
            return;
        }

        int mid = si+(sj-si)/2;
        buildST(2*i+1, si, mid, arr);// left
        buildST(2*i+2, mid+1, sj, arr);// right

        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }
    public static void print(int[] tree){
        for (int i : tree) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildST(0,0,n-1,arr);
        print(tree);
    }
}