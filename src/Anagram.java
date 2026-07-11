import java.util.Scanner;
public class Anagram {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        // 6 is a perfect number
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0)
                sum += i;
        }
        System.out.println(sum == n ? "Perfect" : "Not Perfect");

        String x=sc.next(),y=sc.next();
        boolean z=true;
        if (x.length()!=y.length()){
            z=false;
        }
        if (z) {
            for(char ch:x.toCharArray()){
                if(y.indexOf(ch)!=-1){
                    z=true;
                }else {
                    z=false;
                    break;
                }
            }
        }
        if(z){
            System.out.println("given words "+x+" and "+y+" are anagrams");
        }else {
            System.out.println("given words "+x+" and "+y+" are not anagrams");
        }
    }
}
