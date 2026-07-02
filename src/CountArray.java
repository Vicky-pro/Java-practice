import java.util.Arrays;

public class CountArray {
    void main(){
        int[] arr = {1,2,4,5,6,7,5,4,2,4,5,6,0,4};
        int[]res=(countArrayy(MaxElement(arr),arr));
        System.out.println(Arrays.toString(res));
    }
    public static int MaxElement(int[] arr){
        int max=0;
        for (int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static int[] countArrayy(int n,int[] arr){
        int[] res=new int[n+1];
        for (int i=0;i<res.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    res[i]+=1;
                }
            }
        }
        return  res;
    }
}
