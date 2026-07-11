public class jumpGame {
    static void main() {
        String s="";
        System.out.println(canReach(s,2,3));
    }
    public static boolean canReach(String s, int minJump, int maxJump) {
        int i=0;
        for(int j=0;j<s.length();j++){
            if((i+minJump<=j&&j<=Math.min(i+maxJump,s.length()-1))&&s.charAt(j)=='0'&&i<j){

                if(i+maxJump<s.length()&&s.charAt(i+maxJump)=='0'){
                    i=Math.max(j,i+maxJump);
                }else{
                    i=j;
                }
            }
        }
        if(i==s.length()-1){
            return true;
        }else {
            return false;
        }
    }
}
