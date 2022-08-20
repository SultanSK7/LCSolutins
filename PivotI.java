class PivotI {
    public int pivotIndex(int[] nums) {
        int op=-1;
        for(int i=0;i<nums.length;i++){
            int left=0;
            int right=0;
            
            for(int l =0; l<=i; l++){
                left = left+nums[l];
            }
            
            for(int r =i; r<nums.length; r++){
                right = right+nums[r];
            }
            
            if(left==right){
                op = i;
                break;
            }
            
        }
    return op;
    }
}