public class Polymorphism {
    public static void main(String[] args) {
        //Method overloading

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));        
        // System.out.println(calc.sum(1.5f,2.5f));        
        // System.out.println(calc.sum(1,2,3));   

        //Method overriding

        Deer deer = new Deer();
        deer.eat();
    }
}

//Method overriding
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

//Method overloading
class Calculator{
    int sum(int a,int b){
        return a + b;
    }

    float sum(float a,float b){
        return a + b;
    }

    int sum(int a,int b,int c){
        return a + b + c;
    }
}