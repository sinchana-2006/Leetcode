class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> cmap =new HashMap();
            for(int i =0;i<nums.length;i++){
                  int c = target-nums[i];
                 if(cmap.containsKey(c)){ 
                    return new int[]{cmap.get(c), i}; }
        cmap.put(nums[i],i);
    }
    return new int[]{};
    }
}
