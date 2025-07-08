class Solution {
    public void rotate(int[][] mat) {
          int n=mat.length-1;
          int m[][]=new int[mat.length][mat[0].length];
          for(int i=mat.length-1;i>=0;i--)
            for(int j=0;j<mat[0].length;j++)
            {
                m[j][i]=mat[n-i][j];
            }
       for(int i=0;i<m.length;i++)
           for(int j=0;j<m[0].length;j++)
           {
               mat[i][j]=m[i][j];
           }
    }
}