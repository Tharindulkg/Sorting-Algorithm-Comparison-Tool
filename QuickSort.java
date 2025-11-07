import java.util.Arrays;

public class QuickSort {
    private static int steps = 0;

    public static SortResult sort(int[] data) {
        int[] arr = Arrays.copyOf(data, data.length);
        steps = 0;
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.arraycopy(arr, 0, data, 0, data.length);
        return new SortResult(end - start, steps);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            steps++;
            int pi = partition (arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            steps++;
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i +1;
    }
}