package Lesson7;

public class Animal {
    float size;
    boolean ispredator;
    String colour;
    void run () {
        System.out.println("i am running");
    }
    void eat (String food) {
        System.out.println("I am eating "+ food);
    }
    String sound (){
        if (ispredator)return "Roar";
        else return "cry";
    };
}
