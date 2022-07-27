import java.util.Scanner;

public class NumberPolyndrom {

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