package leetcode;
//Majority Element.
import java.util.*;
class Majority {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> ma = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            ma.put(nums[i],ma.getOrDefault(nums[i],0)+1);
        }    
        n/=2;
        for(HashMap.Entry<Integer , Integer> e : ma.entrySet()){
            if(e.getValue()>n){
                return e.getKey();
            }
        }
        return -1;
    }
}