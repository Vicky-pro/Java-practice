import java.util.Scanner;
public class BitManipulation {
     static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1)==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
