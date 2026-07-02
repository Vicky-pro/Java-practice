import java.util.Arrays;

public class twoPointers {
    static void main() {
        int[] arr = {56,7,12,15,8,6};
        int[] arr1 = {7,8,12,14};
        int count = 0;
        int count1 =0;
        for (int i=0;i<arr.length;i++){
            if((arr[i]&1)==0){
                count++;
            }
        }
        for (int i=0;i<arr1.length;i++){
            if((arr1[i]&1)==0){
                count1++;
            }
        }
        if(count1>count){
            System.out.println("arr1 is Even with "+count1+" even numbers");
            System.out.println("arr is odd with "+count+" even numbers");
        }else {
            System.out.println("arr is Even with "+count+" even numbers");
            System.out.println("arr1 is odd with "+count1+" even numbers");
        }

    }
}
