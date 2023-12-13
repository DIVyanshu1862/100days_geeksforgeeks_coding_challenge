class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
         int start=0;
        int mid=0;
        int last=array.length-1;
        
        while(mid<=last){
            if(array[mid]<a){
                int temp=array[mid];
                array[mid]=array[start];
                array[start]=temp;
                
               start++;
               mid++;
            }
            else if(array[mid] >=a && array[mid]<=b){
                mid++;
            }
            else{
                int temp=array[mid];
                array[mid]=array[last];
                array[last]=temp;
                last--;
            }
        } // code here 
    }
}