/******************************************************************************
| Author : [redacted]								                           |
| Lang : java                                                                  |
| Last edited : 28/3/2022                                                      |
*******************************************************************************/
package project_2;
import java.util.*;
import java.text.DecimalFormat;

// `TODO : convert CLI UI to a proper GUI after code completion
///// TODO_done : working out classes
///// TODO_done : reworking calc for gpa and cgpa
///// TODO_done : refactoring calcs and input vals to methods
// `` You got this.

// * Main class
public class Project_2
{
    public static void clrscr()
    {
        // ! clear console - thanks stackOF!
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    // * Main method
    public static void main (String args[])
    {
        // * Scanner init
        Scanner input = new Scanner(System.in);
        // * DecimalFormat init
        DecimalFormat df = new DecimalFormat("0.00");

        // * Local var data type assignment
        final int size = 100;

        // ? vars below are reserved for loops
        int i = 0, j = 0, count = 0;

        // * class init - as struct-wise;
        sem[] array = new sem[size];
        subsem[] array2 = new subsem[size];

        // * sem object init for [0]
        array[0] = new sem();

        // * user input for a
        System.out.print("Please enter your program : ");
        array[0].sem = input.next();
        array[0].sem = sem.input_val_a(input, array[0].sem);

        array[0].no_sem = sem.b_excep(input, array[0].no_sem);

        clrscr();

        // * for... loop to process sem
        for (i = 0; i < array[0].no_sem; i++)
        {
            // * if not 0, create new obj.
            if (i != 0)
            {
                // * sem object init
                array[i] = new sem();
            }

            // set count to 1 as init
            count = 1;

            sem.no_subject_excep(input, i, array);

            sem.calc_totalNoSubject(i, array);

            // * for... loop to process subsem
            for (j = j; j < array[0].total_no_subject; j++)
            {
                // * Scanner 2nd init
                Scanner input2 = new Scanner(System.in);
                
                // * subsem object init
                array2[j] = new subsem();

                // sub-struct here

                // * user input for subject_code
                System.out.print("\nPlease enter your subject code [" + count + "] : ");
                array2[j].subject_code = input2.nextLine();

                subsem.input_val_subject_code(j, count, array2, input2);

                // * user input for subject_name
                System.out.print("Please enter your subject name [" + count + "] : ");
                array2[j].subject_name = input2.nextLine();

                subsem.input_val_subject_name(j, count, array2, input2);

                subsem.credit_hour_excep(input, j, count, array2);

                // * user input for subject_mark
                System.out.print("Please enter your grade [" + count + "] : ");
                array2[j].subject_mark = input2.nextLine();

                // * calc for user_grade_point
                array2[j].user_grade_point = subsem.calc_grade(array2[j].subject_mark);

                subsem.input_val_user_subject_mark(j, count, array2, input2);

                subsem.calc_varGPA(i, j, array2);
                
                // after 1 sub is done, +1 count 
                count++;

                clrscr();
            } 

            subsem.calc_GPA(i, array2);

            subsem.calc_CGPA(i, array, array2);

            clrscr();
        }

        // * output for sem
        System.out.println("\n\nProgram : " + array[0].sem);

        // ! reset j to 0 as init
        j = 0;

        // * for... loop to process sem output
        for (i = 0; i < array[0].no_sem; i++)
        {
            // ! reset count to 1 as init
            count = 1;

            sem.output_no_sem(i, array);

            // * for... loop to process subsem output
            // ? j current value will be overriden overtime by calc in i loop
            for (j = j; j < array[0].total_no_subject; j++)
            {
                subsem.output_subsem(j, count, array2);

                // after 1 sub is done, +1 count
                count++;

                // if count is equal to current subsem's no_subject, break
                if (count-1 == array[i].no_subject)
                {
                    break;
                }
            }

            subsem.output_gpa(df, i, array2);

            sem.output_cgpa(df, i, array);
            
            // ? j will +1 to previous j's val and cont. loop with new val
            j += 1;
        }
    }
}