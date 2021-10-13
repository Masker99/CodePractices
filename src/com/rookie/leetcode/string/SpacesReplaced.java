package com.rookie.leetcode.string;

/**
 * 空格替换
 * @author Masker
 */
public class SpacesReplaced {
    public String replaceSpace(String s) {
        s.replaceAll("\\s","%20");
        return s;
    }
}
