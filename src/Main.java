public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8};
        System.out.println(BinarySearch(arr,7));
    }
//    public static int pivotSearch(int[] ar){
//
//        int st=0;
//        int end=ar.length-1;
//        int mid;
//
//
//        while (st<=end){
//            mid = st+(end-st)/2;
//            if(mid == 0 || mid == ar.length-1){
//                if(ar[0]>ar[ar.length-1]){
//                    return 0;
//                }else {
//                    return ar.length-1;
//                }
//
//            }
//
//
//            if(ar[mid]>ar[mid+1] && ar[mid]> ar[mid-1]){
//                return mid;
//            } else if (ar[mid]>ar[st]) {
//                st = mid;
//            }else if(ar[mid]<ar[st]){
//                end = mid -1;
//            }
//
//            if(ar[st]==ar[end]&&ar[st]==ar[mid]){
//                st++;
//                end--;
//            }else if (ar[st]==ar[end]){
//                st++;
//                end--;
//            } else if (ar[st]==ar[mid]) {
//                st++;
//            }
//
//        }
//        return -1;
//    }
    public static int BinarySearch(int[] arr,int target){
        int st = 0;
        int end = arr.length-1;
        int mid;
        while(st<=end){
            mid = st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return st;
    }
}

