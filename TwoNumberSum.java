package com.programming;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public TwoNumberSum() {
        super();
    }

    public int[] twoSum(int[] nums, int target) {
        //time:O(n) space:O(n)
        //Here we are searching the elements based on hashing this complexity becomes O(n) if there is no collision in hashmapie O(1)
        //In this way we use hashmap,
        //Its not possibles with arrays because we need to iterte through indexs that complexity will be O(n^2)
        //Once we get the two number indexes just return  the array, No need to iterate.
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ar = { };
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer v = map.getOrDefault(diff, null);

            if (v != null) {
                ar = new int[2];
                ar[0] = v;
                ar[1] = i;
                return ar;
            } else {
                map.put(nums[i], i);
            }

        }
        return ar;
    }
}
