package project_1;

/**
 * This class is for GPA and CGPA calculation.
 * 
 * @author [redacted]
 * @version [redacted]
 * @since [redacted]
 */
public class sem
{
    //gpa_gui gp1 = new gpa_gui();
    
    public double totalCreditPoints = 0;
    public int totalCreditHours = 0;
    public double gpa = 0;
    // type casting - converting int to double
    double gpa_final = gpa;
    
    public int totalCGPACreditHours = 0;
    public double totalCGPACreditPoints = 0; 
    public double cgpa = 0;
    // type casting - converting int to double
    public double cgpa_final = cgpa;
    
    
    /**
     * This function is to receive subject mark and return grade.
     * 
     * @param subject_mark from subject_markTF
     * @return grade
     */
    public String grade_calc (int subject_mark)
    {
        String grade;
        
        if (subject_mark >= 97 && subject_mark <= 100)
        {
            grade = "A+";
        }
        else if (subject_mark >= 93 && subject_mark < 97)
        {
            grade = "A";
        }
        else if (subject_mark >= 90 && subject_mark < 93)
        {
            grade = "A-";
        }
        else if (subject_mark >= 87 && subject_mark < 90)
        {
            grade = "B+";
        }
        else if (subject_mark >= 83 && subject_mark < 87)
        {
            grade = "B";
        }
        else if (subject_mark >= 80 && subject_mark < 83)
        {
            grade = "B-";
        }
        else if (subject_mark >= 77 && subject_mark < 80)
        {
            grade = "C+";
        }
        else if (subject_mark >= 73 && subject_mark < 77)
        {
            grade = "C";
        } 
        else if (subject_mark >= 70 && subject_mark < 73)
        {
            grade = "C-";
        } 
        else if (subject_mark >= 67 && subject_mark < 70)
        {
            grade = "D+";
        }
        else if (subject_mark >= 63 && subject_mark < 67)
        {
            grade = "D";
        }
        else
            grade = "E";
        
        return grade;
    }
    
    /**
     * This function is to receive grade and return user grade point.
     * 
     * @param m as from gradeTF
     * @return user_grade_point
     */
    public double user_grade_point_calc(String m)
    {
        // if grades == A+ / A
        if (m.equalsIgnoreCase("A+") || m.equalsIgnoreCase("A"))
        {
            return 4.00;
        }
        // else if grades == A-
        else if (m.equalsIgnoreCase("A-"))
        {
            // return val to user_grade_point
            return 3.67;
        }
        // else if grades == B+
        else if (m.equalsIgnoreCase("B+"))
        {
            // return val to user_grade_point
            return 3.33;
        }
        // else if grades == B
        else if (m.equalsIgnoreCase("B"))
        {
            // return val to user_grade_point
            return 3.00;
        }
        // else if grades == B-
        else if (m.equalsIgnoreCase("B-"))
        {
            // return val to user_grade_point
            return 2.67;
        }
        // else if grades == C+
        else if (m.equalsIgnoreCase("C+"))
        {
            // return val to user_grade_point
            return 2.33;
        }
        // else if grades == C
        else if (m.equalsIgnoreCase("C"))
        {
            // return val to user_grade_point
            return 2.00;
        }
        // else if grades == D+
        else if (m.equalsIgnoreCase("D+"))
        {
            // return val to user_grade_point
            return 1.33;
        }
        // else if grades == D
        else if (m.equalsIgnoreCase("D"))
        {
            // return val to user_grade_point
            return 1.00;
        }
        // else if grades == E
        else if (m.equalsIgnoreCase("E"))
        {
            // return val to user_grade_point
            return 0.00;
        }
        // else error
        else
        {
            // return val = -1
            // most likely not needed..
            return -1;
        }
    }
    
    /**
     * This function is to receive creditHours and count, adds them and return totalCreditHours.
     * 
     * @param creditHours from gpa_gui
     * @param count for assisting arrays
     */
    public void credit_hour_calc_add (int creditHours[], int count)
    {
        totalCreditHours += creditHours[count];
        // totalCreditHours = previous totalCreditHours + creditHours
        // totalCreditHours = 0 + 4 = 4
        // totalCreditHours = 4 + 3 = 7
    }
    
    /**
     * This function is to receive creditHours and count, minuses them and return totalCreditHours.
     * 
     * @param creditHours
     * @param count 
     */
    public void credit_hour_calc_min (int creditHours[], int count)
    {
        totalCreditHours -= creditHours[count];
        // totalCreditHours = 7 - 3 = 4
    }
    
    /**
     * This function is to calculate and add current GPA from parameters below.
     * 
     * @param creditHours from gpa_gui
     * @param count for assisting arrays
     * @param user_grade_point from gpa_class
     * @return gpa_final
     */
    public double calc_gpa_add(int creditHours[], int count, double user_grade_point[])
    {
        totalCreditPoints += (user_grade_point[count] * creditHours[count]);
        // totalCreditPoints = (4 * 4) = 16
        // totalCreditHours = 0 + 4 = 4
        gpa = totalCreditPoints / totalCreditHours;
        // gpa = 16 / 4 = 4
        
        return gpa;
    }
    
    /**
     * This function is to calculate and minus current GPA from parameters below.
     * 
     * @param creditHours from gpa_gui
     * @param count for assisting arrays
     * @param user_grade_point from gpa_gui
     * @return gpa_final
     */
    public double calc_gpa_min(int creditHours[], int count, double user_grade_point[])
    {
        totalCreditPoints -= (user_grade_point[count] * creditHours[count]);
        gpa = totalCreditPoints / totalCreditHours;
        
        return gpa;
    }
    
    /**
     * This function calculates CGPA from previous 
     * totalCGPACreditPoints and totalCGPACreditHours calculations.
     * 
     * @param a from totalCGPACreditPoints
     * @param b from totalCGPACreditHours
     * @return cgpa_final
     */
    public double calc_cgpa (double a, int b)
    {
        cgpa = totalCGPACreditPoints / totalCGPACreditHours;
        
        return cgpa;
    }
}
