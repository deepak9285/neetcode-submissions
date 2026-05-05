class Solution {
   public final static  int [][]direction={{-1,0},{0,1},{1,0},{0,-1}};
    public void islandsAndTreasure(int[][] grid) {
        //-1 we can not traversed from here
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
         int[][] directions = {{-1,0},{0,1},{1,0},{0,-1}};
        while(!q.isEmpty()){
            int[]curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int[]dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr<row && nc<col && nr>=0 && nc>=0 && grid[nr][nc]==Integer.MAX_VALUE){
                    grid[nr][nc]=grid[r][c]+1;
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
}
