package SegmentTrees;

public class MaxST_creation {
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
    public static int getMax(int[] arr, int qi, int qj){
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if (si > qj || sj < qi){ // no overlap
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) {// complete overlap
            return tree[i];
        } else { // partial overlap
            int mid = si+(sj-si)/2;
            int leftAns = getMaxUtil(2*i+1, si, mid, qi, qj);
            int rightAns = getMaxUtil(2*i+2, mid+1, sj, qi, qj);

            return Math.max(leftAns, rightAns);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildST(0,0,n-1,arr);
        int max = getMax(arr, 2, 5);
        System.out.println(max);
    }
}