class Solution
{    
    public static boolean isAnagram(String a,String b)
    {
        int c=a.length();
        int d=b.length();
        if(c!=d)
            return false;
        char[] arr=a.toCharArray();
        char[] brr=b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<c;i++){
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
    }
}


   

