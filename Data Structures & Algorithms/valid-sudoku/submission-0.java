class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> s33 = new HashSet<>();
        Set<Character> s36 = new HashSet<>();
        Set<Character> s39 = new HashSet<>();
        Set<Character> s63 = new HashSet<>();
        Set<Character> s66 = new HashSet<>();
        Set<Character> s69 = new HashSet<>();
        Set<Character> s93 = new HashSet<>();
        Set<Character> s96 = new HashSet<>();
        Set<Character> s99 = new HashSet<>();
        for(int k=0; k<9; k++){
            for(int i=0; i<9; i++){
                if(board[k][i]=='.'){
                    continue;
                }
                for(int j=i+1; j<9; j++){
                    if(board[k][j]=='.'){
                        continue;
                    }
                    if(board[k][i]==board[k][j]){
                        return false;
                    }
                }
                if(k<3 && i<3){
                    if(board[k][i]!='.'){
                        if(s33.contains(board[k][i])){
                            return false;
                        }
                        s33.add(board[k][i]);
                    }
                }
                else if(k<3 && i<6){
                    if(board[k][i]!='.'){
                        if(s36.contains(board[k][i])){
                            return false;
                        }
                        s36.add(board[k][i]);
                    }
                }
                else if(k<3 && i<9){
                    if(board[k][i]!='.'){
                        if(s39.contains(board[k][i])){
                            return false;
                        }
                        s39.add(board[k][i]);
                    }
                }
                else if(k<6 && i<3){
                    if(board[k][i]!='.'){
                        if(s63.contains(board[k][i])){
                            return false;
                        }
                        s63.add(board[k][i]);
                    }
                }
                else if(k<6 && i<6){
                    if(board[k][i]!='.'){
                        if(s66.contains(board[k][i])){
                            return false;
                        }
                        s66.add(board[k][i]);
                    }
                }
                else if(k<6 && i<9){
                    if(board[k][i]!='.'){
                        if(s69.contains(board[k][i])){
                            return false;
                        }
                        s69.add(board[k][i]);
                    }
                }
                else if(k<9 && i<3){
                    if(board[k][i]!='.'){
                        if(s93.contains(board[k][i])){
                            return false;
                        }
                        s93.add(board[k][i]);
                    }
                }
                else if(k<9 && i<6){
                    if(board[k][i]!='.'){
                        if(s96.contains(board[k][i])){
                            return false;
                        }
                        s96.add(board[k][i]);
                    }
                }
                else if(k<9 && i<9){
                    if(board[k][i]!='.'){
                        if(s99.contains(board[k][i])){
                            return false;
                        }
                        s99.add(board[k][i]);
                    }
                }
            }
        }
        for(int k=0; k<9; k++){
            for(int i=0; i<9; i++){
                if(board[i][k]=='.'){
                    continue;
                }
                for(int j=i+1; j<9; j++){
                    if(board[j][k]=='.'){
                        continue;
                    }
                    if(board[i][k]==board[j][k]){
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
