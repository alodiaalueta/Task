// TASK 13 ACTIVITY ( Create a base class, create a derived class & create an instance then implement a method in the Car class called displayDetails(). ) 

    class Vehicle {
        protected String make;
        protected String model;
        protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        }
    }

    class Car extends Vehicle {
        private final int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); 
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("\nCar Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors +"\n");
         }
    }

    public class Task13 {
        public static void main(String[] args) {
            Car myCar = new Car("Toyota", "Camry", 2022, 4);
            myCar.displayDetails();
        }
}