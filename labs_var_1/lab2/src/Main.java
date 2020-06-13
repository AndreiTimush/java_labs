import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Creature{

}

class Snake extends Creature implements Wriggle{

    public void creep() {
        System.out.println("I can't creep!");
    }

    public void whoAmI() {
        System.out.println("I'm a snake!");
    }

    public void wriggle() {
        System.out.println("I can wriggle");
    }
}

class Dog extends Creature implements Creep{

    public void creep() {
        System.out.println("I can creep!");
    }

    public void whoAmI() {
        System.out.println("I'm a dog!");
    }
}

interface Creep{
    void creep();
    void whoAmI();
}

interface Wriggle extends Creep{
    void wriggle();
}

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Creep[] creep = new Creep[a];
        for (int i = 0; i < a; i++){
            if (i%2 == 0){
                Dog dog = new Dog();
                dog.creep();
                dog.whoAmI();
            }
            else{
                Snake snake = new Snake();
                snake.creep();
                snake.whoAmI();
                snake.wriggle();
            }
        }
        
    }
}
