package hammingdistance;

import java.util.Scanner;

public class RotationWithMaxHammingDistance {
    public static void main(String[] args) {
        
        int n = 4;
        int[] arr = {2,4,8,0};
        System.out.println(findMaxHamDistance(arr,n));
    }

    private static int findMaxHamDistance(int[] arr, int n) {
        int[] arrcp= new int[2*n];
        for(int i=0;i<2*n;i++) {
            arrcp[i] = arr[i%n];
        }
        int maxHam =0;
        for(int i=1;i<n+1;i++) {
            int count =0;
            for(int j=i,k=0;k<n;j++,k++) {
                if(arrcp[j]!=arr[k]) {
                    count++;
                }
            }
            if(count>maxHam) {
                maxHam = count;
            }
        }
        
        
        return maxHam;
    }

}
