import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1};
        int n = arr.length;

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(arr));

        cycleSort(arr, n);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] a, int n) {
        int i = 0;
        while (i < n) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                int temp = a[i];
                a[i] = a[correct];
                a[correct] = temp;
            } else {
                i++;
            }
        }
    }
}

