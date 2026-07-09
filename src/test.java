import java.util.Scanner;

public class test {
    static void main() {
        String s="Camels";
        s=s.toLowerCase();
        int counta=0; int countb=0;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i=0;i<s.length()/2;i++){
            a.append(s.charAt(i));
        }
        for(int i=s.length()/2;i<s.length();i++){
            b.append(s.charAt(i));
        }
        String vowels="aeiou";
        for(char ch:a.toString().toCharArray()){
            if(vowels.indexOf(ch)!=-1){
                counta++;
            }
        }
        for(char ch:b.toString().toCharArray()){
            if(vowels.indexOf(ch)!=-1){
                countb++;
            }
        }
        if(counta == countb){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
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
