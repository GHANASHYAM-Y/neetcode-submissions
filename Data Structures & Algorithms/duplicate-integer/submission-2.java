class Solution {
    public boolean hasDuplicate(int[] a) {
        boolean found=false;

        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                found=true;
                break;
            }
        }
        if(found){
            return true;
        }else{
            return false;
        }

    }
}