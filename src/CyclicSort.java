import java.util.Arrays;

public class CyclicSort {
    static void main() {
        //cyclic sort works for only array of positive integers of range 1 to N
        //in the range of 1 to N, no missing elements are allowed
        int[]arr={9,8,7,6,5,4,3,2,1};
        for (int i=0;i<arr.length;i++){
            while (arr[i]!=i+1){
                int index=arr[i]-1;
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
