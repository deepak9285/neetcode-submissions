class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][]visited=new int[n][m];
        for(int []a:visited) Arrays.fill(a,-1);
        int count=0;
        int[]dx={1,-1,0,0};
        int []dy={0,0,1,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&&visited[i][j]==-1){
                    dfs(grid,i,j,visited,dx,dy,n,m);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][]grid,int row,int col,int[][]visited,int[]dx,int[]dy,int n, int m){
        visited[row][col]=1;
        for(int i=0;i<4;i++){
            int newRow=row+dx[i];
            int newCol=col+dy[i];
            if(newRow<n&&newCol<m&&newRow>=0&&newCol>=0&&grid[newRow][newCol]=='1'&&visited[newRow][newCol]==-1){
                dfs(grid,newRow,newCol,visited,dx,dy,n,m);
            }
        }
    }
}
