import java.util.Arrays;

public class BubbleSort {
    public static SortResult sort(int[] data){
        int[] arr = Arrays.copyOf(data, data.length);
        int n = arr.length;
        int steps = 0;
        long start = System.currentTimeMillis();

        for (int i = 0; i<n-i-1; j++){
            steps++;
            if (arr[j]> arr[j+1]) {
                int temp = arr[j+1];
                arr[j] = arr[j];
                arr [j] = temp;

            }
        }
    }
    long end = System.currentTimeMillis();
    System.arraycopy(arr,0,data,0,data.length);
    return new SortResult(end - start, steps);
}