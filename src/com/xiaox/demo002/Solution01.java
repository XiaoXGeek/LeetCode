package com.xiaox.demo002;

import java.util.List;

/**
 * Created by XiaoX on 2017/9/26.
 */
public class Solution01 {
/*
* 1. 存储上一个数字进位，默认为0
* 2.
*/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = null;
        boolean isFirst = true;
        int carry = 0;
        int sum = 0;
        while(!(l1 == null && l2 == null)){
            ListNode now = null;
            if(l1 != null && l2 !=null){
                sum = l1.val + l2.val + carry;
            }else if(l1 != null && l2 == null){
                sum = l1.val + carry;
            }else if(l1 == null && l2 != null){
                sum = l2.val + carry;
            }
            if(l1 !=null)l1 = l1.next;
            if(l2 !=null)l2 = l2.next;
            if(sum >= 10){
                carry = 1;
                now = new ListNode(sum - 10);
            }else{
                carry = 0;
                now = new ListNode(sum);
            }
            if(isFirst){
                result = now;
                p = now;
                isFirst = false;
            }else{
                p.next = now;
                p = now;
            }
        }
        if(carry == 1)
            p.next = new ListNode(1);
        return result;
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        ListNode l11 = new ListNode(5);
        ListNode l12 = new ListNode(8);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(1);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        ListNode result = solution.addTwoNumbers(l11, l21);
        while(result != null){
           if(result.next != null){
               System.out.print(result.val + "->");
               result = result.next;
           }else{
               System.out.print(result.val);
               break;
           }
        }

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}