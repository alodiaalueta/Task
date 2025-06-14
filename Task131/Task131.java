//TASK 1-3-1 ACTIVITY (Demonstrate Java Polymorphism of various types)

package Task131;

class Afritada {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce", "Meat"};
    System.out.println("\nAfritada = " + java.util.Arrays.toString(Ingredients) + " 🍲");
  }
}

class Mechado extends Afritada {
  public void showIngredients() {
    String[] Ingredients = {
      "Tomato Sauce",
      "Meat",
      "Potatoes & Carrots",
      "Tomato Paste"
    };
    System.out.println("\nMechado = " + java.util.Arrays.toString(Ingredients) );
  }
}

class Menudo extends Afritada {
  public void showIngredients() {
    String[] Ingredients = {
      "Tomato Sauce",
      "Meat",
      "Potatoes & Carrots",
      "Liver Spread",
      "Raisins",
      "Hotdog"
    };
    System.out.println("\nMenudo = " + java.util.Arrays.toString(Ingredients) );
  }
}

class Caldereta extends Afritada {
  public void showIngredients() {
    String[] Ingredients = {
      "Tomato Sauce",
      "Meat",
      "Potatoes & Carrots",
      "Tomato Paste",
      "Liver Spread",
      "Raisins",
      "Hotdog",
      "Cheese"
    };
    System.out.println("\nCaldereta = " + java.util.Arrays.toString(Ingredients) + " 🍲\n");
  }
}

public class Task131 {
  public static void main(String[] args) {
    Afritada meal1 = new Afritada();
    Afritada meal2 = new Mechado();
    Afritada meal3 = new Menudo();
    Afritada meal4 = new Caldereta();

    meal1.showIngredients();
    meal2.showIngredients();
    meal3.showIngredients();
    meal4.showIngredients();
  }
}
