import java.util.Scanner;

public class Strings {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //Strings are IMMUTABLE IN JAVA & JAVASCRIPT

        // Scanner sc = new Scanner(System.in);
        // String name;
        
        // //stops input after space seperation
        // // name = sc.next();

        // // does not stop input after space seperation
        // name = sc.nextLine();

        // System.out.println(name); 

        //Length function

        // String fullName = "Harry Potter";
        // System.out.println(fullName.length());

        //Concatenation & charAt

        // String firstName = "Harry";
        // String lastName = "Potter";
        // String fullName = firstName+" "+lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(4));
        // printLetters(fullName);


        //Compare

        // String s1 = "windows";
        // String s2 = "windows";
        // String s3 = new String("windows");

        // if(s1 == s2){
        //     System.out.println("They are equal");
        // }else{
        //     System.out.println("They are not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("They are equal");
        // }else{
        //     System.out.println("They are not equal");
        // }

        // if(s1.equals(s3)){
        //     System.out.println("They are equal");
        // }else{
        //     System.out.println("They are not equal");
        // }

        //Substring

        String str = "Helloworld";
        System.out.println(str.substring(3,6));
        // System.out.println(substring(str, 3, 6));
    }
    public static String substring(String str,int si,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
}
