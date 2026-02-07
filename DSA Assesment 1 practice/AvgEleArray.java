import java.util.*;
public class AvgEleArray {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int avg = 0;
    int[] arr = new int[n];
    for(int i= 0;i<n;i++){
        arr[i] = sc.nextInt();
         avg = avg + arr[i] ;
        }
         System.out.println(avg/n);
    }
} 


    



