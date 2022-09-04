public class InsertionSort {

    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
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
        for(int n=0; n<=maxList; n+= range){
            int[] d = new int[n];
            long sum = 0;
            for (int k=0; k<repeat; k++){
                for (int i=n-1; i>0; i--){
                    d[i] = i;
                }
                long start = System.currentTimeMillis();
                sort(d);
                sum = sum + System.currentTimeMillis() - start;
            }
            System.out.printf("%d \t %d \t %f \n", n, sum, (double)sum/repeat);

        }
    }
}