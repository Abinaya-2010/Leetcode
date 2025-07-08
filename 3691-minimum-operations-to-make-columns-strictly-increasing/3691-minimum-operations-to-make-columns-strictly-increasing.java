class Solution {
    public int minimumOperations(int[][] grid) {
        int s=0;
        for(int i=0;i<grid.length-1;i++)
            for(int j=0;j<grid[0].length;j++)
            {
                
                if(grid[i+1][j]<=grid[i][j])
                {    s+=(grid[i][j]-grid[i+1][j])+1;
                    grid[i+1][j]+=(grid[i][j]-grid[i+1][j])+1;}
            }
        return s;
    }
}