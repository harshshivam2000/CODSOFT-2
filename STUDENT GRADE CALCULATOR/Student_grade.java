import java.util.*;
public class Student_grade {
    public static void main(String[] args) 
    {
        float Maths,English,Science,Social_studies,Sanskrit,Total_marks,Student_Percentage;

        Scanner Subject_marks=new Scanner(System.in);

         System.out.print("\nEnter the Marks of Maths = ");
         Maths=Subject_marks.nextFloat();
         if(Maths >0 && Maths<=100)
         {

         System.out.print(" \nEnter the Marks of English = ");
         English=Subject_marks.nextFloat();

         System.out.print("\nEnter the Marks of Science = ");
         Science=Subject_marks.nextFloat();
        
         System.out.print("\nEnter the Marks of Social Studies  = ");
         Social_studies=Subject_marks.nextFloat();

         System.out.print("\nEnter the Marks of Sanskrit = ");
         Sanskrit=Subject_marks.nextFloat();

         Total_marks=Maths+English+Science+Social_studies+Sanskrit;
        
         System.out.println("The total marks  of Student is="+Total_marks);
        
        
         Student_Percentage=Total_marks/5;
         System.out.println("The percentage  of Student is="+Student_Percentage);

        
         if (Student_Percentage>=90 && Student_Percentage<=100)
         {
            System.out.println("congrats You got A grade with marks "+Total_marks +" and Percentage ="+ Student_Percentage);

         }

         else if (Student_Percentage>=80 && Student_Percentage<=89)
         {
            System.out.println("congrats You got B grade with marks "+Total_marks +" and Percentage ="+ Student_Percentage);

         }

        else if (Student_Percentage>=70 && Student_Percentage<=79)
         {
            System.out.println("congrats You got C grade with marks "+Total_marks +" and Percentage ="+ Student_Percentage);

         }

        else if (Student_Percentage>=60 && Student_Percentage<=69)
         {
            System.out.println("congrats You got D grade with marks "+Total_marks +" and Percentage ="+ Student_Percentage);

         }

         else
         {
            System.out.println("Sorry you are failed with marks= "+Total_marks +" and Percentage ="+ Student_Percentage);
 
         }
        }
        
        else 
        {
            System.out.println("you are not entring a valid marks");
        }

         
    }
    
}
