public class reverseString {
    static void main() {
        String name="vikas";
        String newName="";
        int r=name.length()-1;
        int i=0;
        while (r>=0){
            newName += name.charAt(r);
            r--;
        }
        System.out.println(newName);
        String Name= new StringBuilder(newName).reverse().toString();
        System.out.println(Name);
    }
}
