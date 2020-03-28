package keyPair;

import java.util.Arrays;
import java.util.Scanner;
public class KeyPairExistInArray
 {
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
     
     private static boolean isPairExist(int[] arr, int n, int key){
         Arrays.sort(arr);
         int a=0; int b= n-1;
         while(a<b){
             if((arr[a]+arr[b]) == key){
                 return true;
             }else if((arr[a]+arr[b]) < key){
                 a++;
             }else{
                 b--;
             }
         }
         return false;
     }
}
