package com.programming;

public class ValidateSequence {
    public ValidateSequence() {
        super();
    }
    //check is s is subsequence of t
    //Here Every character in s should follow the increasing sequence order in t
    //time:O(n) ie length of s, space:O(1)
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            j = t.indexOf((char) s.charAt(i), j) + 1;
            if (j < 1) {
                return false;
            }
        }
        return true;


    }
}
