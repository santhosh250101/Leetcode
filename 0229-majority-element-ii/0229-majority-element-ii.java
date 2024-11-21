class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> result= new ArrayList<>();
        int candi1=0;
        int candi2=0;
        int cnt1=0;
        int cnt2=0;

        for(int num:nums){

            if(num == candi1){
                cnt1++;
            }
            else if(num == candi2){
                cnt2++;
            }
            else if(cnt1==0){
                candi1 = num;
                cnt1++;
            }
            else if(cnt2==0){
                candi2= num;
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for (int num : nums) {
            if (num == candi1) cnt1++;
            else if (num == candi2) cnt2++;
        }

        int n = nums.length;
        if (cnt1 > n / 3) result.add(candi1);
        if (cnt2 > n / 3) result.add(candi2);
        return result;

    }
}