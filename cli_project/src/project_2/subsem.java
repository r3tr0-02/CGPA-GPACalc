/**
 *
 * @author [redacted]
 */
package project_2;

import java.text.*;
import java.util.*;

public class subsem extends sem
{
    public String subject_code = "Unassigned";
    public String subject_name = "Unassigned";
    public int credit_hour = 0;
    public String subject_mark = "Unassigned";

    public double gpa = 0.00;
    public double user_grade_point = 0.00;
    public double totalCreditPoints = 0.00;
    public int totalCreditHours = 0;


    static void input_val_subject_code(int j, int count, subsem[] array2, Scanner input2)
    {
        // * input val for subject_code
        if (array2[j].subject_code.length() != 7)
        {
            do
            {
                System.out.print("\nError! - Please enter correct code format!");
                System.out.print("\nPlease enter your subject code [" + count + "] : ");
                array2[j].subject_code = input2.nextLine();
    
            } while (array2[j].subject_code.length() != 7);
        }
    }

    static void input_val_subject_name(int j, int count, subsem[] array2, Scanner input2)
    {
        // * input val for subject_name
        if (array2[j].subject_name.length() == 0)
        {
            do
            {
                System.out.print("\nError! - Subject Name cannot be empty!");
                System.out.print("\nPlease enter your subject name [" + count + "] : ");
                array2[j].subject_name = input2.nextLine();
    
            } while (array2[j].subject_name.length() == 0);
        }
    }

    static void credit_hour_excep(Scanner input, int j, int count, subsem[] array2)
    {
        boolean error;
        // * do...while loop for looping excep.
        do
        {
            error = false;
            // * try...catch for handling excep.
            try
            {
                // * user input for credit_hour
                System.out.print("Please enter your credit hour [" + count + "] : ");
                array2[j].credit_hour = input.nextInt();
    
                // * input val for credit_hour
                if (array2[j].credit_hour <= 0 || array2[j].credit_hour > 5)
                {
                    do
                    {
                        System.out.print("\nError! - Credit Hour must be in range 1 - 5!");
                        System.out.print("\nPlease enter your credit hour [" + count + "] : ");
                        array2[j].credit_hour = input.nextInt();
    
                    } while (array2[j].credit_hour <= 0 || array2[j].credit_hour > 5);
                }
            }
            catch (InputMismatchException credit_hour_error)
            {
                error = true;
                System.out.print("\nError! - refer credit_hour_error\n");
                input.next();
            }
        } while (error);
    }

    static double calc_grade(String m)
    {
        // ? m = array2[j].subject_mark
        // * if grades == A+ / A
        if (m.equals("A+") || m.equals("A") || m.equals("a+") || m.equals("a"))
        {
            return 4.00;
        }
        // * else if grades == A-
        else if (m.equals("A-") || m.equals("a-"))
        {
            // * return val to user_grade_point
            return 3.67;
        }
        // * else if grades == B+
        else if (m.equals("B+") || m.equals("b+"))
        {
            // * return val to user_grade_point
            return 3.33;
        }
        // * else if grades == B
        else if (m.equals("B") || m.equals("b"))
        {
            // * return val to user_grade_point
            return 3.00;
        }
        // * else if grades == B-
        else if (m.equals("B-") || m.equals("b-"))
        {
            // * return val to user_grade_point
            return 2.67;
        }
        // * else if grades == C+
        else if (m.equals("C+") || m.equals("c+"))
        {
            // * return val to user_grade_point
            return 2.33;
        }
        // * else if grades == C
        else if (m.equals("C") || m.equals("c"))
        {
            // * return val to user_grade_point
            return 2.00;
        }
        // * else if grades == D+
        else if (m.equals("D+") || m.equals("d+"))
        {
            // * return val to user_grade_point
            return 1.33;
        }
        // * else if grades == D
        else if (m.equals("D") || m.equals("d"))
        {
            // * return val to user_grade_point
            return 1.00;
        }
        // * else if grades == E
        else if (m.equals("E") || m.equals("e"))
        {
            // * return val to user_grade_point
            return 0.00;
        }
        // ! else error
        else
        {
            // ! return val = -1, goto if.. (input val.)
            return -1;
        }
    }

    static void input_val_user_subject_mark(int j, int count, subsem[] array2, Scanner input2)
    {
        // * input val for user_grade_point
        if (array2[j].user_grade_point == -1)
        {
            do
            {
                System.out.print("\nError! - wrong grade input!");
                System.out.print("\nPlease enter your grade [" + count + "] : ");
                array2[j].subject_mark = input2.nextLine();
    
                array2[j].user_grade_point = calc_grade(array2[j].subject_mark);
    
            } while (array2[j].user_grade_point == -1);
        }
    }

    static void calc_varGPA(int i, int j, subsem[] array2)
    {
        // * calc for totalCreditHour
        array2[i].totalCreditHours += array2[j].credit_hour;
        // * calc for totalCreditPoints
        array2[i].totalCreditPoints += (array2[j].user_grade_point * array2[j].credit_hour);
    }

    static void calc_CGPA(int i, sem[] array, subsem[] array2)
    {
        // * calc for totalCGPACreditHours and totalCGPACreditPoints
        array[0].totalCGPACreditHours += array2[i].totalCreditHours;
        array[0].totalCGPACreditPoints += array2[i].totalCreditPoints;
    
        // * calc for cgpa
        array[i].cgpa = (double) array[0].totalCGPACreditPoints / array[0].totalCGPACreditHours;
    }

    static void calc_GPA(int i, subsem[] array2)
    {
        // * calc for gpa
        array2[i].gpa = (double) array2[i].totalCreditPoints / array2[i].totalCreditHours;
    }

    static void output_subsem(int j, int count, subsem[] array2)
    {
        System.out.println("\n--------------------------------------");
        System.out.println("Subject no : [" + (count) + "]");
        System.out.println("Subject code : " + array2[j].subject_code);
        System.out.println("Subject name : " + array2[j].subject_name);
        System.out.println("Subject's credit hour : " + array2[j].credit_hour);
        System.out.println("Subject's grade point : " + array2[j].user_grade_point);
    }

    static void output_gpa(DecimalFormat df, int i, subsem[] array2)
    {
        System.out.println("\nGPA : " + df.format(array2[i].gpa));
    }
}
