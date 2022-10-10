package leetcode;

public class StringToInt {

    public static void main(String[] args) {
        String s = "0123-rghrg";
        int number = myAtoi(s);
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s){
        long number = 0;
        boolean start = true;
        int sign = 1;
        String numbers = "0123456789";

        for(int i = 0; i < s.length(); i++){
            if(start && s.charAt(i) == ' '){
                continue;
            }
            if(number == 0 &&  s.charAt(i) == '0'){
                start = false;
                continue;
            }
            if(start && s.charAt(i) == '-'){
                sign=-1;
                start = false;
                continue;
            }
            if (start && s.charAt(i) == '+'){
                start = false;
                continue;
            }
            if (numbers.contains((Character.toString(s.charAt(i))))){
                start= false;
                int x = s.charAt(i) - '0';
                number = number*10 + x;
                if (number * sign > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (number *sign < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            } else break;

        }
        number *=sign;
        return (int)number;
    }
}
