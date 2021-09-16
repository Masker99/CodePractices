package com.rookie.leetcode.string;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class NoRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        int i = 0 ,j = 0;
        int length = 0;
        for(; i < s.length() ; i++){
            char temp = s.charAt(i);
            int index1 = s.indexOf(temp,i+1);
            if(index1 - i == 1){
                if(length == 0)
                    length = 0;
            }
            for(j= i + 1 ; j < index1; j++){
                int sub = s.indexOf(s.charAt(j),j+1);
                if(sub > index1){
                    if(j-i > length){
                        length = j - i+1;
                    }
                    break;
                }
            }
        }

        return length;
    }

    public static void main(String[] args){
        NoRepeatingCharacter noRepeatingCharacter = new NoRepeatingCharacter();
        int result = noRepeatingCharacter.lengthOfLongestSubstring("abcabcbb");
        System.out.print(result);
    }
}
