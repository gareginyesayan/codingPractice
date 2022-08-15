//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.


import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("you have entered " + number/10 + " * 10 + " + number%10);


        long reverseNumber = 0;
        do {
            reverseNumber = reverseNumber*10 + number%10;
            number = number/10;
        }
        while(number != 0 );
        if ((reverseNumber < Integer.MIN_VALUE) || (reverseNumber > Integer.MAX_VALUE)) reverseNumber = 0;
        System.out.println(reverseNumber);


    }
}