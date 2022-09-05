public class InsertionSort {

    public static void sort(int[] arr) {
        int size = arr.length;
        for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;
            while (j >= 0 && key > arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }


    // Driver method
    public static void main(String[] args) {

        int repeat = 10;
        int maxList = 20000;
        int range = 2000;
        for (int n = 2000; n <= maxList; n += range) {
            int[] d = new int[n];
            long sum = 0;
            for (int k = 0; k < repeat; k++) {
                for (int i = n - 1; i > 0; i--) {
                    d[i] = i;
                }
                long start = System.currentTimeMillis();
                sort(d);
                sum += (System.currentTimeMillis() - start);
            }
            System.out.printf("%d \t %d \t %f \n", n, sum, (double) sum / repeat);
        }
    }
}
