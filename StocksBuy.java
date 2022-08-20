class StocksBuy{

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        //System.out.println(min);
        //System.out.println(ans);
        for (int val : prices) {
            min = Math.min(min, val);
            //System.out.println("min" + min);
            ans = Math.max(ans, val - min);
            //System.out.println(ans);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] a = new int[]{7,1,2,9,4,0,1};
        int op = maxProfit(a);
        System.out.println(op);
    }
}