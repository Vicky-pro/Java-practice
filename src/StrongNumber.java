import java.util.Scanner;
public class StrongNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // the number which is equal to sum of factorials of its digit is called strong number. ex: 145
        int n=sc.nextInt(),sum=0,fact=1,temp=n;
        while(n>0){
            int dig=n%10;
            for(int i=dig;i>0;i--){
                fact *= i;
            }
            sum += fact;
            fact = 1;
            n/=10;
        }
        System.out.println(sum == temp ? "Strong number":"not strong number");
    }
}
