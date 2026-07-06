public class MinInRSA {
    static void main() {
        int[] nums={1,3,1,1};
        System.out.println(min(nums));

    }
    public static int min(int[] nums){
        if (nums.length==1||nums[0]<nums[nums.length-1]){
            return nums[0];
        }else if (nums.length==0){
            return -1;
        }else if (nums[nums.length-1]<nums[nums.length-2]){
            return nums[nums.length-1];
        }else if(nums.length ==2){
            return Math.min(nums[0],nums[1]);
        }
        int start=0,end=nums.length-1;
        int mid=0;
        while(start<=end) {
            mid = start + (end - start) / 2;
            while ((start<nums.length&&end>0)&&(nums[start]==nums[mid]&&nums[end]==nums[mid])){
                start++;
                end--;
            }
            if(mid > 0 &&
                    mid < nums.length - 1 &&
                    nums[mid] < nums[mid + 1] &&
                    nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            else if (mid < nums.length - 1 && nums[mid]>=nums[mid+1]){
                    start = mid + 1;
            }else if (mid>nums.length-1&&nums[mid]<nums[mid+1]){
                end=mid;
            }
        }
        return nums[end];
    }
}
