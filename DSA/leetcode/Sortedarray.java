package leetcode;
//Remove Duplicates from Sorted Array.
import java.util.*;
class Sortedarray {
    public int removeDuplicates(int[] nums) {
    ArrayList<Integer> list = new ArrayList<>();
    for(int num: nums){
    if(!list.contains(num)){
    list.add(num);
    }
    }
    for(int i=0; i<list.size(); i++){
        nums[i] = list.get(i);
    } 
    return list.size();
    }
}