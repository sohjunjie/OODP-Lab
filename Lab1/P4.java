/**
 * This program generates a text pattern base on height input
 * from user. An error message will be displayed if the input height is
 * not greater than zero.
 *
 * @author      Soh Jun Jie U1521123B
 * @date        2016/08/23 00:53
 */

import java.util.Scanner;

public class P4{

    public static void main(String[] args){

        int height, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern height: ");
        height = sc.nextInt();

        if(height > 0){
            for(i=1; i<=height; i++){
                for(j=i; j>=1; j--)
                    if(j % 2 != 0)
                        System.out.print("AA");
                    else
                        System.out.print("BB");
                System.out.println();
            }
        }else
            System.out.println("Error input!!");

    }

}
