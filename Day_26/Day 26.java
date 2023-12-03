class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
      ArrayList<Long> ar = new ArrayList<>();
        for(int i=0;i<n;i++) {
            ar.add(a1[i]);
        }
        
        for(int i=0;i<m;i++) {
            if(ar.contains(a2[i])){
                ar.remove(a2[i]);
            } else {
                return "No";
            }
        }
        return "Yes";  
    }
}