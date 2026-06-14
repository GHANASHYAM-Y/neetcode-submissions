class Solution {
    public int missingNumber(int[] a) {
        int n = a.length;

        int esum=n*(n+1)/2;

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }

        return esum-sum;
    }
}
