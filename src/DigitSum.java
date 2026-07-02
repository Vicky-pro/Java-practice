import java.util.Scanner;
public class DigitSum {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while (n>0){
            int dig = n%10;
            sum += dig*dig;
            n=n/10;
        }
        System.out.println(sum);
    }
}
