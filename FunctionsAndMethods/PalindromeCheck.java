public class PalindromeCheck {
    public static boolean isPalindrome(int n){
        int copy_of_n = n;
        int palindrome = 0;
        while(n>0){
            palindrome = palindrome*10 + n%10;
            n = n/10;
        }
        if(copy_of_n == palindrome){
            return true;
        }else { 
            return false;
        }
    }
    public static void main(String[] args) {
        int n=121;
        if(isPalindrome(n)){
            System.out.println(n+" is a palindrome");
        }else{
            System.out.println(n+" is not a palindrome");
        }
    }
}
