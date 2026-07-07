import java.util.Scanner;

public class reverseString {
    static void main() {
        Scanner sc=new Scanner(System.in);
//        String name="vikas";
//        String newName="";
//        int r=name.length()-1;
//        int i=0;
//        while (r>=0){
//            newName += name.charAt(r);
//            r--;
//        }
//        System.out.println(newName);
//        String Name= new StringBuilder(newName).reverse().toString();
//        System.out.println(Name);
//        System.out.println(rNumber(1234567));
        String s=sc.nextLine().toLowerCase();
        System.out.println(isPalindrome(s));

    }
    public static int rNumber(int n){
        int rev = 0;
        while (n!=0){
            rev = rev*10+n%10;
            n/=10;
        }
        return rev;
    }

    public static void gcd() {
        int a=15; int b=25;
//        int lcm=a*b;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
    public static boolean isPalindrome(String s){
        if (s.equals(null)){return true;}
        int start=0;
        int end=s.length()-1;
        while (start<=end){
           if(s.charAt(start)==s.charAt(end)){
               start++;
               end--;
           }else {
               return false;
           }
        }
        return true;
    }

}
