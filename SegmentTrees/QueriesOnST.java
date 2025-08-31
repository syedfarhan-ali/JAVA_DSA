package SegmentTrees;

public class QueriesOnST {
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
        }
        public static void print(int[] tree){
            for (int j : tree) {
                System.out.print(j + " ");
            }
        }
        public static int getSumUtil(int i, int si, int sj, int qi, int qj){
            if (qj <= si || qi >= sj){ // non overlapping
                return 0;
            } else if (si >= qi && sj <= qj) { // complete overlap
                return tree[i];
            } else { // partial overlap
                int mid = si + (sj - si)/2;
                int left = getSumUtil(2*i+1, si, mid, qi, qj);
                int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
                return left+right;
            }
        }
        public static int getSum(int[] arr, int qi, int qj){
            int n = arr.length;
            return getSumUtil(0 , 0, n-1, qi, qj);
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
            int n = arr.length;
            init(n);
            buildST(arr, 0, 0, n-1);
            System.out.println(getSum(arr, 2, 5));
        }
    }