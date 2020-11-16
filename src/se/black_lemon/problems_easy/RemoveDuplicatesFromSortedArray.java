package se.black_lemon.problems_easy;


//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//Clarification:
//Confused why the returned value is an integer but your answer is an array?
//Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
//Internally you can think of this:
//// nums is passed in by reference. (i.e., without making a copy)
//int len = removeDuplicates(nums);
//// any modification to nums in your function would be known by the caller.
//// using the length returned by your function, it prints the first len elements.
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//}

//Example 1:
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2]
//Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.


public class RemoveDuplicatesFromSortedArray {


    //solution
    //Since the array is already sorted, we can keep two pointers i and j, where i is the slow-runner while j is the fast-runner. As long as nums[i] = nums[j]nums[i]=nums[j],
    // we increment j to skip the duplicate.
    //
    //When we encounter nums[j] \neq nums[i]nums[j]
    // =nums[i], the duplicate run has ended so we must copy its value to nums[i + 1]nums[i+1]. ii is then incremented and we repeat the same process again until jj reaches t
    // he end of array.

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
