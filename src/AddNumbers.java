import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddNumbers {


    public static void main(String[] args) {

        List<Integer> l1 = new LinkedList<>(Arrays.asList(9,9,9,9));
        List<Integer> l2 = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
        List<Integer> sum = new LinkedList<>();

//        int i = 0;
//        while(l1.get(i) != null){
//            System.out.println(l1.get(i));
//            i++;
//        };

        int m1 = l1.size();
        int m2 = l2.size();
        int maxsize;
        int elementsSum;
        int remainder;
        int inmind;

        if (m1 > m2) {
            for (int i = m2; i < m1; i++) {
                l2.add(0);
            }
            maxsize = m1;
        } else {
            for (int i = m1; i < m2; i++) {
                l1.add(0);
            }
            maxsize = m2;

        }
        //  int elementsSum;
        inmind = 0;
        for (int i = 0; i < maxsize; i++) {

            elementsSum = l1.get(i) + l2.get(i) + inmind;
            if (elementsSum < 10)
                sum.add(elementsSum);
            else {
                remainder = elementsSum % 10;
                inmind = elementsSum/10;
                sum.add(remainder);

            }
        }
        if (inmind != 0) sum.add(inmind);


        System.out.println(l2);
        System.out.println(l1);
        System.out.println(sum);
    }
}
