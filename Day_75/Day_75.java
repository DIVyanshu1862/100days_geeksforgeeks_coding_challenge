class Solution {
    public boolean Palindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }    
    public int CountPS(String S, int N) {
          //code here
        int count = 0;
        for(int i = 0;i <= N - 1; i++){
          for(int j = i + 2; j <= N; j++){
             String s = S.substring(i , j);
             if(Palindrome(s) && s.length() >= 2){
                 count++;
             }
          }
        }
        return count;
    }
  }