import java.util.Scanner;

public class test {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sumOfPrimes(N));
    }
    public  static int sumOfPrimes(int N){
        if (N<=0){
            return 0;
        } else if (N==2) {
            return 2;
        }
        int sum=2;
        for(int i=3;i<=N;i++){
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                sum+=i;
            }
        }
        return sum;
    }
}
