/**
 * Display the type of movie fan user belongs to base on prompted
 * character choice input.
 * For user input of string length greater than one, the program
 * assumes the first character of the string as choice input.
 *
 * Valid characters for choice input are:
 *              'A', 'a', 'C', 'c', 'D', 'd'
 *
 * All other user inputs are considered invalid, and will result in
 * an "Invalid choice" message.
 *
 * @author      Soh Jun Jie U1521123B
 * @date        2016/08/22 23:53
 */

import java.util.Scanner;

public class P1{

    public static void main(String[] args){

        char choice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a choice character: ");
        choice = sc.next().charAt(0);

        switch (choice) {
            case 'A':
            case 'a': System.out.println("Action movie fan\n");
                      break;
            case 'C':
            case 'c': System.out.println("Comedy movie fan\n");
                      break;
            case 'D':
            case 'd': System.out.println("Drama movie fan\n");
                      break;
            default : System.out.println("Invalid choice\n");
                     break;
        }

    }
}
