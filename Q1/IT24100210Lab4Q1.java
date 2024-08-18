import java .util.Scanner;
public class IT24100210Lab4Q1
{
    public static void main(String[] args)
{
    // Declare the variables
	int number;
	
	// create a Scanner object to read input
	Scanner input = new Scanner(System.in);
	
	//promt the user to enter a number
	System.out.print("Enter a number: ");
	number = input.nextInt();
	
	if  (number >0) {
	   System.out.println("The number is: positive");
	   }
	else if (number <0) {
	   System.out.println("The number is: Negative");
	   }
	else {
	   System.out.println("The number is:Zero");
	   }
   }
   
}