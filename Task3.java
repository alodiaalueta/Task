//TASK 3 ACTIVITY ( Change the variables in the first section, so that each if statement resolves as true.)

public class Task3{
    public static void main (String[]args){
        String a = new String ("Wow");
        String b = "Wow";
        b = a;
        String c = a;
        String d = c;
        d = a + "!";
        c = d;

        boolean b1 = a == b;
        boolean b2 = d.equals(b+"!");
        boolean b3 = !c.equals (a);

        if (b1 && b2 && b3)
            System.out.println("Success!");

    }

}