import java.util.Scanner;
public class IT24100210Lab4Q3
{
   public static void main(String[]args)
   {

// Declare the variables
int number;
String result;

//Create a scanner object to read input
Scanner input = new Scanner(System.in);

//Prompt the user to enter a number
System.out.print("Enter a number");
number = input.nextInt();


result = (number > 0) ? "The number is: Positive": (number < 0) ? "The number is: Negative": "The number is: Zero";

System.out.println(result);

   }

}