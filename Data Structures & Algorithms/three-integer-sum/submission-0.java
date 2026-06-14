class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Set<List<Integer>> res=new HashSet<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==0){
                        res.add(Arrays.asList(a[i],a[j],a[k]));
                    }
                }
            }
        }
        return new ArrayList<>(res);
        
    }
}
