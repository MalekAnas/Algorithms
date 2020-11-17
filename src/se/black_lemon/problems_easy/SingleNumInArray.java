package se.black_lemon.problems_easy;



//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class SingleNumInArray {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};

        System.out.println(findSingle(nums));
    }

    //Iterate through all elements in nums and set up key/value pair.
    //Return the element which appeared only once.
    public static int findSingle(int[] nums){

        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    }



