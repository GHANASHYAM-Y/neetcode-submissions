class Solution {
    public int[] twoSum(int[] a, int k) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==k){
                    return new int[]{i,j};
                }

            }
        }
    return new int[0];
    }
}
