package com.xiaox.demo003;

/**
 * Created by XiaoX on 2017/9/26.
 * 找到不包含重复元素的最长字串的长度
 */
public class Solution01 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (!(chars.length > 0)) {
            return 0;
        }
        int max = 1;
        int start = 0;
        StringBuffer str = new StringBuffer();
        for (int j = start + max - 1; j < chars.length; j++) {
            if (!str.toString().contains(chars[j] + "")) {
                str.append(chars[j]);
            } else {
                start++;
                if (str.length() > max) {
                    max = str.length();
                    str = new StringBuffer();
                }
            }
        }
        if (str.length() > max) max = str.length();
        return max;
    }

    public static void main(String[] args) {
        String[] testCases = new String[]{"", "dvdf", "abcabcbb", "bbbbb", "pwwkew", "c"};
        int i = 0;
        for (String testCase : testCases) {
            System.out.print("测试");
            System.out.println(++i + "--->" + new Solution01().lengthOfLongestSubstring(testCase));
        }

    }

}
