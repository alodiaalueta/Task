// TASK 16 ACTIVITY (Create a gorilla class which implements the Animal interface. Add this comment inside appropriate methods: // lather, rinse, repeat // pet at your own risk // put gorilla food into cage)

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    public boolean feed(boolean timeToEat) {
       
       
    // put gorilla food into cage
        if (timeToEat) {
            System.out.println("\nGorilla! It's time to eat!");
            return true;
        } else {
            System.out.println("\nGorilla is full.");
            return false;
        }
    }

    
    public void groom() {
        
    // lather, rinse, repeat
        System.out.println("\nGorilla! It's Shower time!");
    }

   
    public void pet() {
        
    // pet at your own risk
        System.out.println("\nGorillas are strong! Be careful! \n");
    }

    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.feed(true);
        g.groom();
        g.pet();
    }
}
