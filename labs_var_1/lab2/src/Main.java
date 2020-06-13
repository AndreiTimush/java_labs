import java.util.Scanner;

class Creature{

}

class Snake extends Creature implements Wriggle{

    public void whoAmI() {
        System.out.println("I'm a snake!");
    }

    public void wriggle() {
        System.out.println("I can wriggle");
    }

    @Override
    public void creep() {
        System.out.println("I can't creep!");
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

    public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            Creep[] creep = new Creep[a];
            for (int i = 0; i < a; i++) {
                if (i % 2 == 0) {
                    Dog dog = new Dog();
                    creep[i] = dog;
                } else {
                    Snake snake = new Snake();
                    creep[i] = snake;
                }
            }
            for (int i = 0; i < a; i++) {
                creep[i].whoAmI();
                if (creep[i] instanceof Dog) {
                    ((Dog) creep[i]).creep();
                } else if (creep[i] instanceof Snake) {
                    ((Snake) creep[i]).wriggle();
                }
            }
        }
}
