public class InsertionSort2 {
    public static long counter = 0;
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                counter += 1;
                arr[j + 1] = arr[j];
                j = j - 1;
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
                counter = 0;
                // long start = System.currentTimeMillis();
                sort(d);
                // sum += (System.currentTimeMillis() - start);
                sum += counter;
            }
            System.out.printf("%d \t %d \t %f \n", n, sum, (double) sum / repeat);
        }
    }
}
