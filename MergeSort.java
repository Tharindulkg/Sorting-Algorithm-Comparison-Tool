import java.util.Arrays;

public class MergeSort {
    private static int steps = 0;

    public static SortResult sort(int[] data) {
        int[] arr = Arrays.copyOf(data, data.length);
        steps = 0;
        long start = System.currentTimeMillis();
        mergeSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.arraycopy(arr, 0, data, 0, data.length);
        return new SortResult(end - start, steps);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            steps++;
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            steps++;
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
