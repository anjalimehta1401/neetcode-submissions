class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();

        for(int num:nums)
        {
            set.add(num);
        }

        int lcs=0;

        for(int num:set)
        {

        if(!set.contains(num-1))
        {

            int curr=num;
            int currLen=1;

        

        while(set.contains(curr+1))
        {
            curr++;
            currLen++;
        }

        lcs= Math.max(lcs,currLen);

        }
        }

        return lcs;

        
    }
}
