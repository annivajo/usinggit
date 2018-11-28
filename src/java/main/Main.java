package main;

import main.polymorphism.HasTail;
import main.polymorphism.Lemur;
import main.polymorphism.Primate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learning git");

        Lemur lemur = new Lemur();
        HasTail hasTail = lemur;
         // System.out.println(hasTail.age); // DOES NOT COMPILE

        Primate primate = lemur;
       // System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
    }
}
