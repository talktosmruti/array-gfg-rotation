package SumIndexVal;

public class MaxSumWithRotation {
    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        findMaxSum(arr, n);
    }

    private static void findMaxSum(int[] arr, int n) {
        int arrSum = 0;
        int prevRotationSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            prevRotationSum += i * arr[i];
        }

        int maxSum = prevRotationSum;

        // Sum at Rotation i = Sum at rotation (i-1)+n*arr[i-1]-arrSum
        for (int i = 1; i < n; i++) {
            prevRotationSum =  prevRotationSum + n*arr[i-1] - arrSum;
            if(prevRotationSum > maxSum) {
                maxSum = prevRotationSum;
            }
        }

        System.out.println(maxSum);

    }

}
