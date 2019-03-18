package blog.genvana1314.study.leetcode.day01.question1;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

    /**
     * my solution.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < map.size(); i++) {
            int anotherNum = target - nums[i];
            if(map.containsKey(anotherNum) && map.get(anotherNum) != i) {
                return new int[] {i,map.get(anotherNum)};
            }
        }
        return null;
    }

    /**
     * the better solution that i can understand.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumBetter(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < map.size(); i++) {
            int anotherNum = target - nums[i];
            if(map.containsKey(anotherNum) && map.get(anotherNum) != i) {
                return new int[] {map.get(anotherNum), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
