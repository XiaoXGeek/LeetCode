package com.xiaox.demo001;

/**
 * Created by XiaoX on 2017/9/26.
 * 投机取巧的方法
 */
public class Solution02 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }

    public static void main(String[] args){
        Solution02 solution = new Solution02();
        int[] test = new int[]{2, 5, 5, 11};
        int[] result = solution.twoSum(test, 10);
        System.out.println(result[0] + ", " + result[1]);
    }
}
