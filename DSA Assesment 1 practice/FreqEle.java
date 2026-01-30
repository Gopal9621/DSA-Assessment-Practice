import java.util.*;
public class FreqEle {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      int[] arr = new int[n];
      boolean[] arr1 = new boolean[n];
    for(int i= 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i =0; i< n; i++){
        if(arr1[i]){
            continue;
        }
        int count = 1;
        for(int j = i+1; j<n; j++){
            if(arr[i] ==arr[j]){
                count++;
                arr1[j] = true;

            }
        }
        System.out.println(arr[i]+ " => " + count);
    }
   } 
}   

