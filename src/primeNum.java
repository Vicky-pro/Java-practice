import java.util.Arrays;
import java.util.Scanner;
public class primeNum {
    static void main() {
        sieve(100);
    }
    public static void sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for (int i=p*p;i<=n;i+=p){
                    isPrime[i]=false;
                }
            }
        }

        for (int i=2;i<=n;i++){
            if (isPrime[i]){
                System.out.print(i+", ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }else {
            for (int i=2;i<=Math.pow(n,0.5);i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
