class ClimbingStairs {
    public static int helper(int x, int n){
        if(x==n){
            return 1;
        }
        if(x>n){
            return 0;
        }
        
        return helper(x+1,n)+helper(x+2,n);
    }
    public static int climbStairs(int n) {
       int op =0;
        op = helper(0,n);
        return op;
    }

    public static void main(String[] args) {
    	int op =0;
    	op=climbStairs(5);
    	System.out.println(op);
    }
}