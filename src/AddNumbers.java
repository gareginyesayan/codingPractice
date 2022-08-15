/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddNumbers {


    public static void main(String[] args) {

        List<Integer> l1 = new LinkedList<>(Arrays.asList(9,9,9,9));
        List<Integer> l2 = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
        List<Integer> sum = new LinkedList<>();


        int m1 = l1.size();
        int m2 = l2.size();
        int maxsize;
        int elementsSum;
        int remainder;
        int carry;

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

        carry = 0;
        for (int i = 0; i < maxsize; i++) {

            elementsSum = l1.get(i) + l2.get(i) + carry;
            if (elementsSum < 10)
                sum.add(elementsSum);
            else {
                remainder = elementsSum % 10;
                carry = elementsSum/10;
                sum.add(remainder);

            }
        }
        if (carry != 0) sum.add(carry);


        System.out.println(l2);
        System.out.println(l1);
        System.out.println(sum);
    }
}
