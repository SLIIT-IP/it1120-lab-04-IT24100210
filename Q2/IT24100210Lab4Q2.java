import java.util.Scanner;
public class IT24100210Lab4Q2
{
       public static void main(String[]args)
   {
       Scanner scanner=new Scanner(System.in);
       int Ex_Marks, Lab_Marks, Ex_Percentage, Lab_Percentage;
    
       double Final_Mark;
      
       System.out.print("Please enter exam marks (out of 100): ");
       Ex_Marks=scanner.nextInt();
       if(Ex_Marks<0 || Ex_Marks>100)
     {
       System.out.print("Invalid input for exam marks. Terminating program.");
       return;
     }
      
      System.out.print("Please enter lab submission marks (out of 100): ");
      Lab_Marks=scanner.nextInt();
      if(Lab_Marks<0 || Ex_Marks>100)
     {
       System.out.print("Invalid input for lab submission marks. Terminating program.");
       return;
     }
     
      System.out.print("Please enter the percentage given for the exam: ");
      Ex_Percentage=scanner.nextInt();
    
      System.out.print("Please enter the percentage given for the lab submission: ");
      Lab_Percentage=scanner.nextInt();

      if(Ex_Percentage+Lab_Percentage!=100)
    {
      System.out.print("The percentage must add up to 100. Terminating program.");
      return;
    }
   
      Final_Mark=(Ex_Marks*Ex_Percentage/100.0)+(Lab_Marks*Lab_Percentage/100.0);
      System.out.print("Final Exam Mark is : " +Final_Mark);
   }
}