import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while(num != 0){
            rev = rev*10 +num%10;
            num /= 10;
        }
        if(temp== rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
