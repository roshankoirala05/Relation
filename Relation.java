/**
   @author ROSHAN KOIRALA
   @version 1.0
   @since 10/27/2014
  
   A Java program that reads the ordered pairs for a binary relation on a set and determines 
  whether the relation is/ is not Reflexive, Symmetric, and Antisymmetric.
 */

// importing required java packages
import java.util.*;
import java.io.*;

public class Relation
{
   public static void main(String[] args) throws IOException
   {
      // Creating a two dimensional array of size equal to the size of given set.
      int[][] matrix = new int[5][5];
      Scanner keyboard = new Scanner(new File("relation.txt"));
      boolean Reflexive = true;
      boolean Symmetric = true;
      boolean AntiSymmetric=true; 
   
      // Reading the relation set form a text file, and transfering it in the Matrix form using array
      while( keyboard.hasNext())
      {
         int a, b;
         a = keyboard.nextInt();
         b = keyboard.nextInt();
         matrix[a-1][b-1] = 1;
         keyboard.nextLine();
      }
     
      System.out.println("The  Binary Matrix representation of given matrix is\n ");
      
      // Analysing the different properties of the relation
      for( int i = 0; i<= 4 ; i++)
      {
         for ( int j = 0; j <=4; j++)
         {
            // Printing the relation in Binary- Matrix form
            System.out.print(matrix[i][j]+"\t");
         
            // Counter-Example test for Reflexivity
            if ( i == j && matrix[i][j] == 0)
               Reflexive = false;
           
           // Counter-Example test for Symmetricity
            if ( matrix[i][j] == 1 && matrix[j][i] == 0 )
               Symmetric = false;
           
           // Counter-Example test for Antisymmetricity
            if (i!=j && matrix[i][j] == 1 && matrix[j][i] ==1)
               AntiSymmetric = false; 
         }
         System.out.print("\n");                                                                                               
      
      } // End of Loop

            
      String Rnot, Snot, ASnot;
      Rnot="";
      Snot="";
      ASnot="";
      
      if(Reflexive == false)
         Rnot= "not ";
     
      if( Symmetric == false)
         Snot= "not ";
     
      if(AntiSymmetric == false)
         ASnot="not ";
     
      System.out.format("\nThe given Relation is %sReflexive, is %sSymmetric, and is %sAntisymmetric.", Rnot, Snot, ASnot);
   
   }
   
   }

