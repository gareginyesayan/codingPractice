package other;
/*
* Given an input string = aabbbccccaaaaa, maintain the insertion order and output a2b3c4a5
* */

public class TransformString {

    public static void main(String[] args) {
        String str = "baabbbccccaaaaaf";
        System.out.println(alterString(str));
    }

    public static String alterString(String str){

        if(str.length()==0) return str;
        int counter = 1;

        String altered = "" + str.charAt(0);
        for (int i =1; i < str.length(); i++){

            if (str.charAt(i) == str.charAt(i-1)){
                counter++;
            }
            else {
                altered = altered + counter +str.charAt(i);
                counter = 1;
            }

            if(i == str.length()-1) altered = altered + counter;

        }

        return altered;
    }
}
