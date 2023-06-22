package Day4;

import java.util.ArrayList;
import java.util.List;

public class majorityelement2 {
     public List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new ArrayList<>();
    if (nums == null || nums.length == 0) {
        return result;
    }

    int n = nums.length;
    int count1 = 0, count2 = 0;
    int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;

    // Step 1: Find the two potential candidates using the Boyer-Moore Voting Algorithm
    for (int num : nums) {
        if (num == candidate1) {
            count1++;
        } else if (num == candidate2) {
            count2++;
        } else if (count1 == 0) {
            candidate1 = num;
            count1 = 1;
        } else if (count2 == 0) {
            candidate2 = num;
            count2 = 1;
        } else {
            count1--;
            count2--;
        }
    }

    // Step 2: Count the occurrences of the potential candidates
    count1 = 0;
    count2 = 0;
    for (int num : nums) {
        if (num == candidate1) {
            count1++;
        } else if (num == candidate2) {
            count2++;
        }
    }

    // Step 3: Check if the candidates appear more than ⌊n/3⌋ times and add them to the result
    if (count1 > n / 3) {
        result.add(candidate1);
    }
    if (count2 > n / 3) {
        result.add(candidate2);
    }

    return result;
    }
}
