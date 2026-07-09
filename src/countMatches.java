import java.util.ArrayList;
import java.util.List;

public class countMatches {
    static void main() {

        System.out.println(canPalindrome("eeeed"));

    }
    public static boolean canPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left < right)
        {
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return checkPalindrome(s,left+1,right) || checkPalindrome(s,left,right-1);
            }
        }
        return true;
    }
    public static boolean checkPalindrome(String s,int left,int right){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
    public static boolean isPalindrome(String s) {
        StringBuilder builder=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)||Character.isDigit(c)){
                builder.append(Character.toLowerCase(c));
            }
        }
        String newS=builder.toString();
        if(builder.reverse().toString().equals(newS)){
            return true;
        }else{
            return false;
        }
    }
    public static int haystackNeedle(String haystack, String needle){
        if(haystack.contains(needle)){
            for(int i=0;i<haystack.length();i++){
                if(haystack.charAt(i)==needle.charAt(0)&&haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static String exelSheet(int columnNumber){
        StringBuilder sb = new StringBuilder();
        while (columnNumber>0){
            int temp=26;
            if(columnNumber%26!=0){temp=columnNumber%26;}
            temp = temp+64;
            char c=(char)temp;
            sb.append(c);
            columnNumber--;
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
    public static String Decryption(String s){
        // example: "22#911#119#"; o/p vikas
        char[] alpha={'@','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuilder builder=new StringBuilder();

        System.out.println(alpha.length);
        for (int i=0;i<s.length();i++){
            if(i+2<s.length()&&s.charAt(i+2)=='#'){
                builder.append(alpha[(Character.getNumericValue(s.charAt(i))*10)+Character.getNumericValue(s.charAt(i+1))]);
                i=i+2;
            }else {
                builder.append(alpha[Character.getNumericValue(s.charAt(i))]);
            }
        }
        return builder.toString();
        //Optimal solution
//        StringBuilder sb= new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int num;
//
//            if (s.charAt(i) == '#') {
//                num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
//                i -= 2;
//
//            } else {
//                num = s.charAt(i) - '0';
//            }
//
//            sb.append((char) (num - 1 + 'a'));
//        }
//
//        return sb.reverse().toString();
    }
    public static String sentenceShuffle(String s){
        String[] sArr = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<sArr.length;i++){
            while (Character.getNumericValue(sArr[i].charAt(sArr[i].length()-1))!=i+1){
                int index=Character.getNumericValue(sArr[i].charAt(sArr[i].length()-1));
                String temp=sArr[index-1];
                sArr[index-1]=sArr[i];
                sArr[i]=temp;
            }
        }
        for (String str: sArr){
            builder.append(str);
            builder.delete(builder.length()-1,builder.length());
            builder.append(" ");
        }
        builder.delete(builder.length()-1,builder.length());
        return builder.toString();
    }
}


