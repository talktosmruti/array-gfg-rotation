package keyPair;

import java.util.HashSet;
import java.util.Scanner;

public class KeyPairExistsWithHashing {
    
    public static void main (String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       
       for(int i=0;i<t;i++){
           int n = sc.nextInt();
           int key = sc.nextInt();
           int[] arr = new int[n];
           for(int j=0;j<n;j++){
               arr[j] = sc.nextInt();
               
           }
           boolean isExists = isPairExist(arr, n, key);
           if(isExists){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
       }
    }

    private static boolean isPairExist(int[] arr, int n, int key) {
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<n;i++) {
            int pair = key - arr[i];
            if(set.contains(pair)) {
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }

}
