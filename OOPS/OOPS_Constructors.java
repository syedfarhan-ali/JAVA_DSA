public class OOPS_Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "student1";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        
        Student s2 = new Student(s1);
        s2.password = "xyz";

        s1.marks[2] = 100;

        for(int i=0; i<s2.marks.length; i++){
            System.out.println(s2.marks[i]);
        }
        
        
        Student s4 = new Student("student4");
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //Non parametrized constructor
    Student(){
        marks = new int[3];
        System.out.println("this is non parametrized constructor");
    }
    //Parametrized constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
        System.out.println("This is parametrized Constructor ");
    }
    //Shallow Copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    //     System.out.println("This is copy Constructor ");
    // }

    //Deep Copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

}
