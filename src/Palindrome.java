import java.util.Scanner;
public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int temp = n;
        int rev =0;
        while(temp>0){
            int dig = temp%10;
            rev = rev*10+dig;
            temp = temp/10;
        }
        if(rev == n){
            System.out.println(n + " is palindrome");
        }else {
            System.out.println(n + " is not palindrome");
        }
    }
}
