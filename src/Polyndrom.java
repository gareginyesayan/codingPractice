import java.util.Scanner;

public class Polyndrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String st = sc.nextLine();
        System.out.println("you have entered " + st);
        int n = st.length();
        String reverseSt ="";
        for (int i = n-1; i>=0; i--)
            reverseSt = reverseSt + st.charAt(i);
        System.out.println(reverseSt);
        if (st.equals(reverseSt))
            System.out.println("This is a polyndrom");
        else
            System.out.println("This is not a polyndrom");


    }
}
