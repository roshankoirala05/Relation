// Roshan Koirala
// Dr. Cordova
// CSCI 3026
// 10/7/2104
/* Program Description: The Program computes and prints the value 
                        of the product for values of n = 1, 2, 3, …, 10 using both the product
                          of n values and the explicit formula derived in exercise 1 */



public class Sequence
{
   
   public static void main(String[] args)
   {
   
      int product=1 ;
      System.out.println("\n***********************************************************************************************************************************");
      System.out.println("Using Product of n values\n");
      for ( int n = 1 ; n<=10; n++)
      {
      
         product = (int)(product *(1+(1.0/n)));
         System.out.println("The product for value of n = "+n+" is "+product);
      }
   
      System.out.println("\n***********************************************************************************************************************************");
      System.out.println("\nUsing the explicit formula for the sequence\n");
      for ( int i = 1 ; i<=10; i++)
      {
      
         System.out.println("The product for value of n = "+i+" is "+(i+1));
      }
      System.out.println("\n***********************************************************************************************************************************");
   
   }
}