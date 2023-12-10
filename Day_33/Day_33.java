class Solution 
{ 
public static long[] productExceptSelf(int nums[], int n) 
{ 
        long[] pA = new long[n];  //created new array
        for(int i=0;i<n;i++){
            long c=1;
            for(int j=0;j<n;j++){
                if(i==j) continue;
        
                    c*=nums[j];
                
            }
            pA[i]=c;
        }
        return pA;
        
} 
} 