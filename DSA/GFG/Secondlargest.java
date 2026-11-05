package GFG;
//Second largest in array.
class Secondlargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int ans1 = -1;
        for(int i=0; i<n; i++){
            if(ans1<arr[i]){
                ans1=arr[i];
            }
        }
        int ans2 = -1;
        for(int i=0; i<n; i++){
            if(ans1!=arr[i]){
                if(ans2<arr[i]){
                    ans2=arr[i];
                }
            }
        }
        return ans2;
    }
}