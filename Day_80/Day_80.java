class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        
        boolean vis[]=new boolean[V];
        
        int count=0;
        for(int i=0; i<V; i++)
        {
            if(vis[i]==false)
            {
                count++;
                dfs(adj,i,vis);
                
            }
        }
        return count;
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[])
    {
        vis[s]=true;
        
        for(int neighbor: adj.get(s))
        {
            if(vis[neighbor]==false)
            {
                dfs(adj,neighbor,vis);
            }
        }
    }
};