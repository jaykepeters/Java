public class Main
{

    public static void greeting(String name, int age)
    {
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old. ");
    }

    public static void printer(int favoriteNumber)
    {
        for (int i = 1; i <= favoriteNumber; i++)
        {
            System.out.println("Counter: " + i);
        }

        switch(favoriteNumber)
        {
            case 17:
                System.out.println("Hey, that's my favorite number!");
                break;
            default:
                System.out.println("Welp...");
        }
    }
    
    public static void main(String[] args)
    {
        greeting("Jayke", 15);

        // Favorite Number?
        printer(17);
    }
}
