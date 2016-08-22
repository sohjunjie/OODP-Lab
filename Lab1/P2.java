/**
 * The program display the grade of an employee base on his
 * salary and merit points.
 * The private method getEmployeeGrade performs branching to
 * determine the grade character of the employee.
 *
 * Assumptions: An employee will not receive a grade if salary
 *              is below $500. "No grade" will be displayed in
 *              this scenario.
 *
 * @author      Soh Jun Jie U1521123B
 * @date        2016/08/23 00:53
 */

import java.util.Scanner;

public class P2{

    private static char getEmployeeGrade(double salary, int meritPoint){
        if (salary >= 799)
            return 'A';
        if (salary >= 700 && meritPoint >= 20)
            return 'A';
        if (salary >= 700 && meritPoint < 20)
            return 'B';
        if (salary >= 649)
            return 'B';
        if (salary >= 600 && meritPoint >= 10)
            return 'B';
        if (salary >= 500)
            return 'C';
        return ' ';
    }

    public static void main(String[] args){

        double salary;
        int meritPoint;
        char grade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        System.out.print("Enter merit point: ");
        meritPoint = sc.nextInt();

        grade = getEmployeeGrade(salary, meritPoint);

        if(grade != ' ')
            System.out.println("Grade " + grade);
        else
            System.out.println("No grade");

    }
}
