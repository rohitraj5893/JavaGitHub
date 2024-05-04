import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

 public final class StudentGradeCalculator
{
	public static void main (String[] args)
	{
         Scanner sc = new Scanner(System.in);
         // Input the marks of all subjects
         System.out.print("Enter the marks of Hindi : ");
         float hindi = sc.nextFloat();
         System.out.print("Enter the marks of English : ");
         float english = sc.nextFloat();
         System.out.print("Enter the marks of Mathematices : ");
         float math = sc.nextFloat();
         System.out.print("Enter the marks of Computer : ");
         float computer = sc.nextFloat();
         System.out.print("Enter the marks of Science : ");
         float science = sc.nextFloat();
         // Calculate Total Marks
         float totalmarks = hindi + english + math + computer + science;
         System.out.println("Sum of marks all subjects :  " + totalmarks);
         // Calculate Average Percentage:-
         float per = totalmarks/5;
         System.out.println("Average Percentage : "+ per);
         // Grade Calculation:-
         if(per>=95 && per<100) System.out.println("Grade : A+");
         else{
            if(per>=85 && per<95) System.out.println("Grade : A");
            else{
                if(per>=80 && per<85) System.out.println("Grade : B");
                else{
                    if(per<=75 && per<80) System.out.println("Grade : C");
                    else System.out.println("D");
                }
            }
         }
         
	}
        
   }
 
             

