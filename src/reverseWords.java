public class reverseWords {
    static void main() {
        String s="Let's take LeetCode contest";
        String[] sArr=s.split(" ");
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<sArr.length;i++){
            for (int j=sArr[i].length()-1;j>=0;j--){
                builder.append(sArr[i].charAt(j));
            }
            sArr[i]=builder.toString();
            builder.delete(0,builder.length());
        }
        for (String str:sArr){
            builder.append(str+" ");
        }
        System.out.println(builder.toString());
        System.out.println(sArr[0].toString());


    }
}
