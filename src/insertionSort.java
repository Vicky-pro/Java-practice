import java.util.Arrays;

public class insertionSort {
    static void main() {
        int[] arr={5,3,4,1,2};
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]>arr[j-1]){
                    break;
                }else {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
