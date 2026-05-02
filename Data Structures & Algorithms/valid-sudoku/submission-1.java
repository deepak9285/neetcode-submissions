class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashMap<Integer,HashSet<Character>>square=new HashMap<>();
        for(int i=0;i<board.length;i++){
          if(!isValidRow(board,i,board.length,square)||!isValidColumn(board,i,board.length,square)){
            return false;
          }
        }
        return true;
    }
    public boolean isValidRow(char[][]board, int row,int n,HashMap<Integer,HashSet<Character>>mp){
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(board[row][i] == '.') continue;
            if(set.contains(board[row][i])) return false;
            set.add(board[row][i]);

            int index=(row/3)*3+(i/3);
            if(mp.get(index) == null) mp.put(index, new HashSet<>());
            HashSet<Character>ss=mp.get(index);
            if(ss.contains(board[row][i])) return false;
            ss.add(board[row][i]);
        }
        return true;
    }
    public boolean isValidColumn(char[][]board ,int col,int n,HashMap<Integer,HashSet<Character>>mp){
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(board[i][col] == '.') continue;
            if(set.contains(board[i][col])) return false;
            set.add(board[i][col]);
            // Sub-boxes are already checked in isValidRow
        }
        return true;
    }
}