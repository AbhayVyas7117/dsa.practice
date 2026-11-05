package GFG;
//Count distinct elements in array.
import java.util.*;
class Countdistintarray {
    public int countDistinct(int arr[]) {
        // code here
        HashMap <Integer,Integer> ma = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            ma.put(arr[i],1);
        }
        return ma.size();
    }
}