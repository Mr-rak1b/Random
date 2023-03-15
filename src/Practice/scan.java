package Practice;

public class scan {
    public static void main(String[] args) {


        java.util.Scanner x = new java.util.Scanner(System.in);

        System.out.println("What year you were born? :");
        int q = x.nextInt();
        System.out.println("What year is it now? :");
        int w = x.nextInt();

        while(w<q)
        {
            System.out.println("Please enter a valid year : ");
            w = x.nextInt();
        }
        System.out.println("You are " + (w - q) + " years old");

        System.out.println(" ");

        System.out.println("Enter a year and see how old you'll be at that year : ");

        int e = x.nextInt();
        while (e < q)
        {
            System.out.println("Error!! Please enter a valid year");
            e =x.nextInt();
        }

        System.out.println("You will be " + (e-q) + " @ " + e);}
    }

