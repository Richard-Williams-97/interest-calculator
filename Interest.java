import java.util.Scanner;

public class Interest{
   public static void main(String[]args)
   {
   
      double deposit;
      int rate;
      int year;
   
      double balance;
   
      Scanner kb= new Scanner(System.in);
   
      try{
         System.out.println("Input initial deposit amount:");
         deposit=Double.parseDouble(kb.nextLine());
      
         System.out.println("Input interest rate (%):");
         rate=Integer.parseInt(kb.nextLine());
      
         System.out.println("Input number of years:");
         year=Integer.parseInt(kb.nextLine());
      
         System.out.printf("Initial: %.2f\n", deposit);
      
         for(int x=1;x<=year;x++)
         {
            balance=deposit*Math.pow((1+(.01*rate)), x);
            System.out.printf("End of year %s: $%-15.02f\n",""+x+"", balance);
         }
      }catch(Exception r)
      {System.out.printf("Invalid input: "+r.getMessage());}
   
   }}