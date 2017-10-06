package com.xiaox.demo003;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by XiaoX on 2017/9/26.
 * 找到不包含重复元素的最长字串的长度
 * 在这小小的佩服下自己，竟然想到用队列，呀哈哈哈！
 */
public class Solution01 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (!(chars.length > 0)) {
            return 0;
        }
        int max = 1;
        Queue<String> queue = new LinkedList<String>();
        for (int j = 0; j < chars.length; j++) {
            if (!queue.contains(chars[j]+"")) {
                queue.add(chars[j]+"");
            } else {
                if (queue.size() > max) {
                    max = queue.size();
                }
                while (queue.size()>0 && !queue.poll().equals(chars[j]+""));
                queue.add(chars[j]+"");
            }
        }
        if (queue.size() > max) max = queue.size();
        return max;
    }

    public static void main(String[] args) {
        String[] testCases = new String[]{"", "dvdf", "abcabcbb", "bbbbb", "pwwkew", "c", "aab"};
        int i = 0;
        for (String testCase : testCases) {
            System.out.print("测试");
            System.out.println(++i + "--->" + new Solution01().lengthOfLongestSubstring(testCase));
        }
    }
}
