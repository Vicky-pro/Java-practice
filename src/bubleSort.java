import java.util.Arrays;

public class bubleSort {
    static void main() {
        int[] arr = {-1,-4,-2,-9,-10,0,8,-6};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++)
                if(arr[i]>=arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        }

        return arr;
    }
}
