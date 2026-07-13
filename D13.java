1291 - Sequential Digits
/
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<=9;i++){
            int res=0;
            for(int j=i+1;j<=9;j++){
                res=res*10+j;

                if(res>=low && res<=high) ans.add(res);

                if(res>high) break;

            }
        }
        Collections.sort(ans);
        return ans;
    }
}
