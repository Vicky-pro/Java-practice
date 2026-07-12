import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class arrayIntersection {
    static void main() {
        int[] nums1={4,7,9,7,6,7};
        int[] nums2={5,0,0,6,1,6,2,2,4};
        HashMap<Integer, Integer> map=new HashMap<>();
        HashMap<Integer, Integer> map1=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(i,nums1[i]);
        }
        int j=0;
        for(int i=0;i<nums2.length;i++){
            if(map.containsValue(nums2[i])){
                if(!map1.containsValue(nums2[i])){
                    map1.put(j++,nums2[i]);
                }
            }
        }
        int[] arr = new int[map1.size()];

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            arr[entry.getKey()] = entry.getValue();
        }
        System.out.println(Arrays.toString(arr));
    }
    //optimal solution
//    boolean[] flag = new boolean[1001];
//
//        for (int num : nums1) {
//        flag[num] = true;
//    }
//
//    int[] result = new int[Math.min(nums1.length, nums2.length)];
//    int index = 0;
//
//        for (int num : nums2) {
//        if (flag[num]) {
//            result[index++] = num;
//            flag[num] = false;
//        }
//    }
//
//        return Arrays.copyOf(result, index);
}
