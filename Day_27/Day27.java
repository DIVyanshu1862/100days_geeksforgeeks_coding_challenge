class Compute {
    
    public void rotate(int arr[], int n)
    {
         int t=arr[0];
        for(int i=0;i<n;i++){
           int u=arr[(i+1)%n];
           arr[(i+1)%n]=t;
           t=u;
           
        }
    }
}