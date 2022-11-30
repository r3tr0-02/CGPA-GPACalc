/**
 *
 * @author [redacted]
 * 
 */
package project_2;

import java.text.*;
import java.util.*;

public class sem
{
    public String sem = "Unassigned";
    public int no_sem = 0;
    public int no_subject = 0;
    public int total_no_subject = 0;
    
    public int totalCGPACreditHours = 0;
    public double totalCGPACreditPoints = 0.00;
    public double cgpa = 0.00;

    
    static String input_val_a(Scanner input, String a)
    {
        // * input validation for a
        if (a.length() == 0)
        {
            do
            {
                System.out.print("\nError! - Program name can't be empty!");
                System.out.print("\nPlease enter your program : ");
                a = input.next();
            } while (a.length() == 0);
        }
    
        return a;
    }

    static int b_excep(Scanner input, int b)
    {
        boolean error;
        // * do...while loop for looping excep.
        do
        {
            error = false;
            // * try...catch for handling excep.
            try
            {
                // * user input for b
                System.out.print("\nPlease enter your no of sem : ");
                b = input.nextInt();
            }
            catch (InputMismatchException b_error)
            {
                error = true;
                System.out.print("\nError! - refer b_error");
                input.next();
            }
        } while (error);
    
        return b;
    }

    static void calc_totalNoSubject(int i, sem[] array)
    {
        // * calc for total_no_subject
        array[0].total_no_subject += array[i].no_subject;
    }

    static void no_subject_excep(Scanner input, int i, sem[] array)
    {
        boolean error;
        // * do...while loop for looping excep.
        do
        {
            error = false;
            // * try...catch for handling excep.
            try
            {
                // * user input for no_subject
                System.out.print("\nPlease enter your no of subject for this sem [" + (i+1) + "] : ");
                array[i].no_subject = input.nextInt();
            }
            catch (InputMismatchException no_subject_error)
            {
                error = true;
                System.out.print("\nError! - refer no_subject_error");
                input.next();
            }
        } while (error);
    }

    static void output_no_sem(int i, sem[] array)
    {
        System.out.println("\n--------------------------------------");
        System.out.println("Sem no : [" + (i+1) + "]");
        System.out.println("No of subject : " + array[i].no_subject);
    }

    static void output_cgpa(DecimalFormat df, int i, sem[] array)
    {
        System.out.println("CGPA : " + df.format(array[i].cgpa));
        System.out.print("\n");

        // * output for latest cgpa and totalCGPACreditHours
        if (i == array[0].no_sem-1)
        {
            System.out.println("\n--------------------------------------");
            System.out.println("CGPA (overall) : " + df.format(array[i].cgpa));
            System.out.println("Total credit hours : " + array[0].totalCGPACreditHours);
        }
    }
}
