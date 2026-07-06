import java.util.ArrayList;
import java.util.Arrays;

public class CyclicSort {
    static void main(String[] args) {
        //cyclic sort works for only array of positive integers of range 1 to N
        //in the range of 1 to N, no missing elements are allowed
//        int[]nums={7,8,9,11,12};
//
//        int i=0;
//        while(i<nums.length){
//            int correctIndex=nums[i]-1;
//            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[correctIndex]){
//                int temp=nums[i];
//                nums[i]=nums[correctIndex];
//                nums[correctIndex]=temp;
//            }else {
//                i++;
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));
        int[] arr={1,2,0};int[] arr2={3,4,-1,1};
        System.out.println(firstMissingPositive(arr2));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }

        return nums.length+1;
    }
}
