package com.xiaox.demo001;

/**
 * Created by XiaoX on 2017/9/26.
 * 最笨的方法
 */
public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean quit = false;
        for(int i=0; i<nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    quit = true;
                    break;
                }
            }
            if(quit)break;
        }
        return result;
    }

    public static void main(String[] args){
        Solution01 solution = new Solution01();
        int[] test = new int[]{2, 5, 5, 11};
        int[] result = solution.twoSum(test, 10);
        System.out.println(result[0] + ", " + result[1]);
    }
}
