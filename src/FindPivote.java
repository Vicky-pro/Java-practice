public class FindPivote {
    static void main(String[] args) {
        //cheeeeeeeeeeeeeeeeeeeeeeeeeeeeee

    }
    public static int pivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            while (start<arr.length-1&&arr[start]==arr[end]){
                start++;
                end--;
            }
            if (arr[mid]>=arr[start]){
                start=mid+1;
            }else {
                end=mid;
            }
        }
        return end;
    }
}
