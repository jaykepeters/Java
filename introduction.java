import javax.swing.JOptionPane;

public class Main
{

    public static void greeting(String name, int age)
    {
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old. ");
    }

    public static void printer(int favoriteNumber)
    {
        for (int i = 1; i <= favoriteNumber; i++) {System.out.println("Counter: " + i);}

        switch (favoriteNumber)
        {
            case 17:
                System.out.println("Hey, that's my favorite number!");
                break;
            default:
                System.out.println("Welp...");
        }
    }

    public static String question()
    {
        String school;
        school = JOptionPane.showInputDialog("What school do you go to?: ");
        return school;
    }

    public static class Teenager
    {
        int age;
        Boolean single;
    }

    public static void main(String[] args)
    {
        greeting("Jayke", 15);

        // Favorite Number?
        printer(17);

        // School?
        String personSchool = question();
        System.out.println(personSchool + " is a pretty good school!");

        // Class implementation
        class it extends Teenager {
            String name;
            int gradYear;

            Boolean isAvailable()
            {
                if (this.single == true) {
                    System.out.println("He's single...");
                } else {
                    System.out.println("He's taken...");
                }
                return this.single;
            }
        }

        it me = new it();
        me.age = 15;
        me.single = true;
        me.name = "Jayke";
        me.gradYear = 2021;
        Boolean status = me.isAvailable();
        System.out.println("You are: " + status);
    }
}
