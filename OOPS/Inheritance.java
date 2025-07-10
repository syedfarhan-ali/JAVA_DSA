public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // Dog d1 = new Dog();
        // d1.eat();
        // d1.legs = 4;
        // System.out.println(d1.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    // int legs;
    void walk(){
        System.out.println("walking");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}


// class Dog extends Mammal {
//     String breed;
// }

//Derived class 
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims");
//     }
// }