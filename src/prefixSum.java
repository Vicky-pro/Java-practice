import java.util.Arrays;

public class prefixSum {
    static void main() {
//        int[] arr={67,89,56,33,7,5,6,88};
//        int[] prefixSum=new int[arr.length];
//        prefixSum[0]=arr[0];
//        for (int i=1;i<arr.length;i++){
//            prefixSum[i]=prefixSum[i-1]+arr[i];
//        }
        zerosToEnd2();

        System.out.println("🙄🫪");
    }
    public static void zerosToEnd(){
        int[] arr={1,2,0,4,5,0,12};
        int j=arr.length-1;
        int i=0;
        while(arr[j]==0){
            j--;
        }
        while (i<=j){
            if(arr[j]==0)j--;
            if(arr[i]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void zerosToEnd2(){
        int[] arr={1,2,0,4,5,0,12};
        int i=0;int j=0;
        while(i<arr.length-1){
            if(arr[i]!=0){
                i++;
                j++;
            }else if(arr[j]==0){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j=i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
