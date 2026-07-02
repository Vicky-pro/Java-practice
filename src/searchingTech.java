import java.util.Scanner;
public class searchingTech {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int st=sc.nextInt();
        int sec=sc.nextInt();
//        System.out.println(fib(n));
        System.out.println(FWS(n,st,sec));
    }
    public static int FWS(int numberToFind, int first, int second){
        int res=0;
        for (int i=3;i<=numberToFind;i++){
            res=first+second;
            first = second;
            second = res;
        }
        return res;
    }
    public static int fib(int n){
        int a=0; int b=1;
        for (int i = 2;i<=n;i++) {
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
