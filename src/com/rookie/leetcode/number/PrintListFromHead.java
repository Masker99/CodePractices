package com.rookie.leetcode.number;

import java.util.Arrays;

/**
 * @author Masker
 */
public class PrintListFromHead {
    public int[] reversePrint(ListNode head){
        int num = 0;
        ListNode begin = head;
        while(true){
            num++;
            if (begin.next== null){
                break;
            }
            begin = begin.next;
        }

        int[] arr = new int[num];
        begin = head;
        for(int i = 0 ; i < num ; i++){
            arr[i] = begin.val;
            begin = begin.next;
        }

        int[] temp = new int[num];
        int length = num;
        for(int i = 0 ; i < length ; i++){
            temp[i] = arr[--num];
        }

        return temp;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode head = listNode1;

        PrintListFromHead printListFromHead = new PrintListFromHead();
        int[] arr = printListFromHead.reversePrint(head);
        System.out.println(Arrays.toString(arr));
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
