package keyPair;

import java.util.Scanner;

public class KeyPairInSortedRotated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = /* sc.nextInt(); */1;

        for (int i = 0; i < t; i++) {
            int n = /* sc.nextInt(); */6;
            int key = /* sc.nextInt(); */45;
            int[] arr = /* new int[n]; */ { 11, 15, 30, 38, 9, 10 };
            /*
             * for(int j=0;j<n;j++){ arr[j] = sc.nextInt();
             * 
             * }
             */
            boolean isExists = isPairExist(arr, n, key);
            if (isExists) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean isPairExist(int[] arr, int n, int key) {
        int pivot = findPivot(arr, 0, n - 1);
        System.out.println("pivot:"+pivot);
        int a = (pivot + 1) % n;
        int b = pivot;

        while (a != b) {
            if (arr[a] + arr[b] == key) {
                return true;
            } else if (arr[a] + arr[b] < key) {
                a = (a + 1) % n;
            } else {
                b = (b - 1 + n) % n;
            }
        }

        return false;

    }

    private static int findPivot(int[] arr, int i, int j) {
        int mid = (i + j) / 2;
        if (i > j) {
            return -1;
        } else if (i == j) {
            return i;
        } else if (arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (arr[mid - 1] > arr[mid]) {
            return mid - 1;
        } else if (arr[mid] <= arr[i]) {
            return findPivot(arr, i, mid - 1);
        } else {
            return findPivot(arr, mid + 1, j);
        }
    }

}
