package com.rookie.leetcode.jianzhiOffer.datastructure;

import java.util.LinkedList;

public class offer09 {
    class CQueue {
        LinkedList<Integer> A,B;
        public CQueue() {
            A = new LinkedList<>();
            B = new LinkedList<>();
        }

        public void appendTail(int value) {
            A.addLast(value);
        }

        public int deleteHead() {
            if (!B.isEmpty()){
                return B.removeLast();
            }else if(A.isEmpty() && B.isEmpty()){
                return -1;
            }else if (B.isEmpty()){
                while(!A.isEmpty()){
                    B.addLast(A.removeLast());
                }
                return B.removeLast();
            }

            return 0;
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
