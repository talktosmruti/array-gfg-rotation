package keyPair;

import java.util.Scanner;

public class KeyPairCountSortedRotated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = /* sc.nextInt(); */1;

        for (int i = 0; i < t; i++) {
            int n = /* sc.nextInt(); */5;
            int key = /* sc.nextInt(); */45;
            int[] arr = /* new int[n]; */ {7, 9, 11, 12, 15};
            /*
             * for(int j=0;j<n;j++){ arr[j] = sc.nextInt();
             * 
             * }
             */
            System.out.println(findPairCount(arr, n, key));
        }
        sc.close();
    }

    private static int findPairCount(int[] arr, int n, int key) {
        int pivot = findPivot(arr, 0, n - 1);
        System.out.println("pivot "+pivot);
        int count = 0;

        int a = (pivot + 1) % n;
        int b = pivot;

        while (a != b) {
            if (arr[a] + arr[b] == key) {
                System.out.println("match");
                count++;
                /* Condtion to avoid cross over n infinite loop*/
                if (a == (b - 1 + n) % n) {
                    return count;
                }
                a = (a + 1) % n;
                b = (b - 1 + n) % n;
            } else if (arr[a] + arr[b] < key) {
                a = (a + 1) % n;
            } else {
                b = (b - 1 + n) % n;
            }
        }
        return count;
    }

    private static int findPivot(int[] arr, int i, int j) {
        int mid = (i + j) / 2;
        if (i > j) {
            return -1;
        } else if (i == j) {
            return i;
        } else if (mid < j && arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (mid> i && arr[mid - 1] > arr[mid]) {
            return mid - 1;
        } else if (arr[mid] <= arr[i]) {
            return findPivot(arr, i, mid - 1);
        } else {
            return findPivot(arr, mid + 1, j);
        }
    }
}
