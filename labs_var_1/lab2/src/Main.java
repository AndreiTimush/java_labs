class Creature{

}
class Snake extends Creature implements Wriggle{

    @Override
    public void creep() {

    }

    @Override
    public void whoAmI() {

    }

    @Override
    public void wriggle() {

    }
}

class Dog extends Creature implements Creep{

    @Override
    public void creep() {

    }

    @Override
    public void whoAmI() {

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
    
}
