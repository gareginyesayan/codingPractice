public class ArrayBubbleSort {

    public static void main(String[] args) {

        int n = 7;
        int[] array = new int[7];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "  ");
        }

        for (int j = 1; j < n - 1; j++)
            for (int i = 0; i < n - j; i++) {
                if (array[i] > array[i + 1])
                    switchThem(array, i);
                //System.out.println(("ok"));
            }
        System.out.println( "  ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "  ");
        }

    }

    private static void switchThem(int[] array, int i) {

        array[i] = array[i] + array[i + 1];
        array[i+1] = array[i] - array[i + 1];
        array[i] = array[i] - array[i + 1];
    }
}

