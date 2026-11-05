package leetcode;
// Kth Largest Element in an Array.
import java.util.*;
class K {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue <Integer> PQ = new PriorityQueue<>();
    for (final int num : nums) {
      PQ.offer(num);
      while (PQ.size() > k)
        PQ.poll();
    }

    return PQ.peek();
    }   
}