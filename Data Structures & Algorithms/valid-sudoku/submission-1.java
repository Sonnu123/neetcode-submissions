class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> bub = new HashSet<>();
        for(int i = 0; i<9; i++){
            bub.clear();
            for(int k = 0; k<9; k++){
                if(board[k][i] == '.'){
                    continue;
                }
                else if(bub.contains(board[k][i])){
                    return false;
                }
                else{
                    bub.add(board[k][i]);
                }
            }
        }
        bub.clear();
        for(int i = 0; i<9; i++){
            bub.clear();
            for(int k = 0; k<9; k++){
                if(board[i][k] == '.'){
                    continue;
                }
                else if(bub.contains(board[i][k])){
                    return false;
                }
                else{
                    bub.add(board[i][k]);
                }
            }
        }
        bub.clear();
        for(int rs = 0; rs<9; rs+=3){
            for(int cs = 0; cs<9; cs+=3){
                bub.clear();
                for(int row = rs; row < rs+3; row++){
                    for(int col = cs; col < cs+3; col++){
                        if(board[row][col] == '.'){
                            continue;
                        }
                        else if(bub.contains(board[row][col])){
                            return false;
                        }
                        else{
                            bub.add(board[row][col]);
                        }
                    }
                }
            }
        }
        return true;
        
    }
}
