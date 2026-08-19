class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<9; i++){
            set.clear();
            for(int k = 0; k<9; k++){
                if(board[i][k]=='.'){
                    continue;
                }
                else if(set.contains(board[i][k])){
                    return false;
                }
                else{
                    set.add(board[i][k]);
                }
            }
        }
        set.clear();
        for(int i = 0; i<9; i++){
            set.clear();
            for(int k = 0; k<9; k++){
                if(board[k][i]=='.'){
                    continue;
                }
                else if(set.contains(board[k][i])){
                    return false;
                }
                else{
                    set.add(board[k][i]);
                }
            }
        }
        for(int y = 0; y<9; y+=3){
            for(int i = 0; i<9; i+=3){
                set.clear();
                for(int row = y; row<y+3; row++){
                    for(int col = i; col<i+3; col++){
                        if(board[row][col]=='.'){
                            continue;
                        }
                        else if(set.contains(board[row][col])){
                            return false;
                        }
                        else{
                            set.add(board[row][col]);
                        }
                    }
                }
      
            }

       }
        return true;
    }
}
