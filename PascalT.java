class PascalT {
    public List<List<Integer>> generate(int numRows) {
        
       List<List<Integer>> Superlist = new ArrayList<>();
        //List<Integer> List1 = new ArrayList<>;
        if(numRows==0)  return Superlist;
        
        List<Integer>first = new ArrayList<>();
        first.add(1);
        Superlist.add(first);
        if(numRows==1)  return Superlist;
        
        List<Integer>sec = new ArrayList<>();
        sec.add(1);
        sec.add(1);
        Superlist.add(sec);
        if(numRows==2)  return Superlist;
        
        
        
        for(int i=2; i<numRows;i++){
           List<Integer> prev = Superlist.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(0,1);
            for(int j=1;j<prev.size();j++){
                
                curr.add(j,(prev.get(j-1)+prev.get(j)));
                
            }
            curr.add(prev.size(),1);
            Superlist.add(curr);
            
        }
    return Superlist;
    }
}