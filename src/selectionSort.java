import java.util.Arrays;

public class selectionSort {
    static void main() {
        int last = 0;
        int[]arr ={10,3,4,4,3,2,5,6,3,2,3};
        for (int i=0;i<arr.length;i++){
            last = arr.length-1-i;
            int maxIndex=getMax(arr,0,last);
            swap(arr,maxIndex,last);

        }
        System.out.println(Arrays.toString(arr));

    }
    public static int getMax(int[] arr,int start,int last){
        int max=0;
        for (int i=0;i<=last;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
