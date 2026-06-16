class Solution {
    public int[] productExceptSelf(int[] a) {
        int[] res=new int[a.length];

        for(int i=0;i<a.length;i++){
        int prod=1;
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    prod*=a[j];
                }
            }
            res[i]=prod;
        }
        return res;

    }
       
}  
