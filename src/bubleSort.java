import java.util.Arrays;

public class bubleSort {
    static void main() {
        int[] arr = {-1,-4,-2,-9,-10,0,8,-6};
        int[] ar={3,2,2,3,1,5,4};
        System.out.println(Arrays.toString(sort(ar)));
    }
    public static int[] sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++)
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
        }

        return arr;
    }
}
