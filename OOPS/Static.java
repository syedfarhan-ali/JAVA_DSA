public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "KV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    int returnPercentage(int math,int phy,int chem){
        return (math + phy + chem)/3;
    }
    
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}