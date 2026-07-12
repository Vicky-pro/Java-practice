import java.util.Arrays;

public class palindrome1616 {
    static void main() {
        int[] arr=new int[5];
        String[] aa={"asd","sdg","zsdgf"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(aa));
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        int[] res;
        int[] res1;
        boolean s1;
        boolean s2;
        if(a.length()<=1){
            return true;
        }else{
            res=checking(a,b,0,a.length()-1);
            res1=checking(b,a,0,a.length()-1);
            s1=isPalindrome(a);
            s2=isPalindrome(b);
            if((res[0]>0&&res[1]<a.length()-1)||(res1[0]>0&&res1[1]<a.length()-1)){
                return true;
            }else if(s1||s2){
                return true;
            }
            else{
                return false;
            }
        }
    }
    private static int[] checking(String first, String second, int left, int right){
        int[] res=new int[2];
        for(int i=0;i<first.length();i++){
            if(first.charAt(left)==second.charAt(right)){
                left++;
                right--;
            }else{
                break;
            }
        }
        res[0]=left;
        res[1]=right;
        return res;
    }
    private static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){

            sb.append(s.charAt(i));
        }
        if(s.equals(sb.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}
