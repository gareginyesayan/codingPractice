import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ArrayListBubbleSort {

    public static void main (String[] args){

        ArrayList<Integer> array = new ArrayList<>();
        int n = 7;
        for(int i=0; i<n; i++){
            array.add((int)(Math.random()*10));
        }
        System.out.println(array);
        for (int j = 1; j<n-1; j++)
            for(int i = 0; i < n-j; i++) {
                if(array.get(i) > array.get(i+1))
                    switchThem( array, i);

        }

        System.out.println(array);

    }

    private static void switchThem(@NotNull ArrayList<Integer> array, int i){

       array.set(i , array.get(i) + array.get(i+1));
       array.set(i , array.get(i) - array.get(i+1));
       array.set(i+1 , array.get(i) - array.get(i+1));
    }
}
