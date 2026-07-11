import java.util.Scanner;
public class notes {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=500){
            int x = n/500;
            System.out.println("500 --> "+x);
            n = n%500;
        }
        if(n>=100){
            int x = n/100;
            System.out.println("100 --> "+x);
            n = n%100;
        }
        if(n>=50){
            int x = n/50;
            System.out.println("50 --> "+x);
            n = n%50;
        }
        if(n>=20){
            int x = n/20;
            System.out.println("20 --> "+x);
            n = n%20;
        }
        if(n>=10){
            int x = n/10;
            System.out.println("10 --> "+x);
            n = n%10;
        }
        if(n>=5){
            int x = n/5;
            System.out.println("5 --> "+x);
            n = n%5;
        }if(n>=2){
            int x = n/2;
            System.out.println("2 --> "+x);
            n = n%2;
        }if(n>=1){
            System.out.println("1 --> "+n);
        }
        int[] N = {15,4,12,13,15,13,12};
        int sum=0;
        for(int i=0;i<N.length;i++){
            sum = sum^N[i];
        }
        System.out.println(sum);
    }
}
