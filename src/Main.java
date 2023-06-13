import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       Scanner num = new Scanner(System.in);
       double numOne = 0.0;
       double numTwo = 0.0;
       System.out.println("Pick a number!");
       if (num.hasNextInt())
       {
           numOne = num.nextInt();
           num.nextLine();
           System.out.println("Pick another number!");
           if (num.hasNextInt())
           {
               numTwo = num.nextInt();
               if (numOne > numTwo)
               {
                   System.out.println(numOne + " is greater than " + numTwo);
               }
               else if (numOne < numTwo)
               {
                   System.out.println(numOne + " is less than " + numTwo);
               }
               else
               {
                   System.out.println("You picked the same number twice!");
               }
           }
           else
           {
               System.out.println("You did not pick a number!");
           }
       }
       else
       {
           System.out.println("You did not pick a number!");
       }

    }
}