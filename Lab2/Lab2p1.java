import java.util.Scanner;

/**
 * Perform numeric manipulation such as multiplication test, divide,
 * modulus, counting number of digits, extracting digits in a given
 * number
 *
 * @author      Soh Jun Jie
 * @version     1.0
 */
public class Lab2p1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int choice, dividend, divisor, digitNum, digitFind;
        long digitlist;

        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: mulTest();
                break;
                case 2:
                    System.out.print("Enter dividend: ");
                    dividend = sc.nextInt();
                    System.out.print("Enter divisor: ");
                    divisor = sc.nextInt();
                    System.out.println(dividend + "/" + divisor + "=" + divide(dividend, divisor) + "\n");
                break;
                case 3:
                    System.out.print("Enter dividend: ");
                    dividend = sc.nextInt();
                    System.out.print("Enter divisor: ");
                    divisor = sc.nextInt();
                    System.out.println(dividend + " % " + divisor + " = " + modulus(dividend, divisor) + "\n");
                break;
                case 4:
                    System.out.print("Enter a number: ");
                    digitNum = sc.nextInt();
                    if(digitNum >= 0){
                        System.out.println("n: " + digitNum + " - count = " + countDigits(digitNum) + "\n");
                    }else{
                        System.out.println("Error!");
                    }
                break;
                case 5:
                    System.out.print("Enter a number: ");
                    digitNum = sc.nextInt();
                    System.out.print("Enter digit to find: ");
                    digitFind = sc.nextInt();
                    System.out.println("Position = " + position(digitNum, digitFind) + "\n");
                break;
                case 6: /* add extractOddDigits() call */
                    System.out.print("Enter a digit list: ");
                    digitlist = sc.nextLong();
                    System.out.println("oddDigits = " + extractOddDigits(digitlist) + "\n");
                break;
                case 7: System.out.println("Program terminating...");
            }
        } while (choice < 7);
    }

    public static void mulTest(){
        int i, x, y, userAns, correctAns, score = 0;
        int minNum = 1, maxNum = 9;
        for(i=0;i<5;i++){
            x = minNum + (int) (Math.random() * maxNum);
            y = minNum + (int) (Math.random() * maxNum);
            System.out.println("How much is " + x + " times " + y + "?: ");
            userAns = sc.nextInt();
            correctAns = x * y;
            if(userAns==correctAns){
                score += 1;
            }
        }
        System.out.println(score + " answers out of 5 are correct\n");
    }

    public static int divide(int m, int n){
        int quotient = 0;
        while((m-=n) >= 0){
            quotient += 1;
        }
        return quotient;
    }

    public static int modulus(int m, int n){
        while((m-=n) >= 0){}
        return m + n;
    }

    public static int countDigits(int n){
        int numDigits = 0;
        do{
            numDigits += 1;
        }while((n/=10) != 0);
        return numDigits;
    }

    public static int position(int n, int digit){
        int curPos = 0, posVal = -1;

        do{
            curPos++;
            if(n % 10 == digit){
                posVal = curPos;
                break;
            }
        }while((n/=10) != 0);

        return posVal;
    }

    public static long extractOddDigits(long n){
        int digitPlace = 1;
        long oddDigitsList = 0;

        do{
            if((n % 10) % 2 != 0){
                oddDigitsList = oddDigitsList + digitPlace * (n % 10);
                digitPlace *= 10;
            }
        }while((n/=10) != 0);

        return oddDigitsList;
    }

}
