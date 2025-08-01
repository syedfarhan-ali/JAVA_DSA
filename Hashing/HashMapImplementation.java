package Hashing;
import java.util.*;

public class HashMapImplementation {
    static class HashMap<K,V> {//generic
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n
        private int N;
        private LinkedList<Node> buckets[];//N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % N;
        }

        private int searchInLL(K key, int bucketIdx){
            LinkedList<Node> ll = buckets[bucketIdx];
            int dataIdx = 0;
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return dataIdx;
                }
                dataIdx++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = N*2;

            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in bucket
            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){//O(lambda) -> O(1) because lambda is always smaller than some constant value
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx);

            if(dataIdx != -1){
                Node node = buckets[bucketIdx].get(dataIdx);
                node.value = value;
            } else {
                buckets[bucketIdx].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){//2.0 is the threshold value
                rehash();
            }
        }
        public boolean containsKey(K key){//O(lambda) -> O(1)
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx);

            if(dataIdx != -1){//valid
                return true;
            } else {//invalid
                return false;
            }

        }
    
        public V remove(K key){//O(lambda) -> O(1)
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx);

            if(dataIdx != -1){
                Node node = buckets[bucketIdx].remove(dataIdx);
                n--;
                return node.value;
            } else {
                return null;
            }
        }
    
        public V get(K key){//O(lambda) -> O(1)
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIdx);

            if(dataIdx != -1){
                Node node = buckets[bucketIdx].get(dataIdx);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
    
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
