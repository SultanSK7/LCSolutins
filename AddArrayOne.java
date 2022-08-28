class AddArrayOne {
    public int[] plusOne(int[] digits) {
       int[] op = new int[digits.length +1];
        
        for(int i = digits.length-1; i >=0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
                }
            
        }
        op[0]=1;
        return op;
        
    }
}