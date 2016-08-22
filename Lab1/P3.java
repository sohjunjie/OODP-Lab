/**
 * This program generates a currency conversion table from
 * USD to SGD. 3 tables will be generated using different loop
 * constructs: for loop, while loop, do-while loop.
 *
 * User can specify start amount, ending amount and increment
 * amount for which the table will be generated.
 *
 * An "Error input!!" message will be displayed if ending amount
 * is less than starting amount or when increment amount is less than
 * or equal to zero.
 *
 * @author      Soh Jun Jie U1521123B
 * @date        2016/08/23 01:13
 */

import java.util.Scanner;

public class P3{

    private static final double USD_SGD_RATE = 1.82;

    public static void main(String[] args){

        int startAmt, endAmt, step, amt;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start amount: ");
        startAmt = sc.nextInt();
        System.out.print("Enter ending amount: ");
        endAmt = sc.nextInt();
        System.out.print("Enter increment amount: ");
        step = sc.nextInt();

        if(endAmt >= startAmt && step > 0){

            System.out.println("\n1. For Loop");
            System.out.format("%-5s%-10s%-5s\n", "US$", "", "S$");
            System.out.format("%-20s\n", "--------------------");
            for(amt=startAmt; amt<=endAmt; amt+=step)
                System.out.format("%-5d%-10s%-5f\n", amt, "", amt*USD_SGD_RATE);

            System.out.println("\n2. While Loop");
            System.out.format("%-5s%-10s%-5s\n", "US$", "", "S$");
            System.out.format("%-20s\n", "--------------------");
            amt = startAmt;
            while(amt <= endAmt){
                System.out.format("%-5d%-10s%-5f\n", amt, "", amt*USD_SGD_RATE);
                amt+=step;
            }

            System.out.println("\n3. Do-While Loop");
            System.out.format("%-5s%-10s%-5s\n", "US$", "", "S$");
            System.out.format("%-20s\n", "--------------------");
            amt = startAmt;
            do{
                System.out.format("%-5d%-10s%-5f\n", amt, "", amt*USD_SGD_RATE);
                amt+=step;
            }while(amt <= endAmt);

        }else
            System.out.println("Error input!!");

    }
}
