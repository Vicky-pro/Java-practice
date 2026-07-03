public class reverseString {
    static void main() {
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
        gcd();
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
        int a=13; int b=17;
        int lcm=a*b;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(lcm/a);
    }


}
