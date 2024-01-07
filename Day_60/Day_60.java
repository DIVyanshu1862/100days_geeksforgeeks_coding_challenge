class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
       for(int k=0;k<=2;k++) {
        for(int i=0;i<(n/2+n%2);i++)
        {
            for(int j=0;j<n/2;j++)
            {
        int temp = matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1]=matrix[j][n-1-i];
                matrix[j][n-1-i]=matrix[i][j];
                matrix[i][j]=temp;
            }

        }
       }
    }
}