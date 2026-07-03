class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    if(rows.containsKey(i)){
                        if(rows.get(i).contains(board[i][j])){
                            return false;
                        }
                        rows.get(i).add(board[i][j]);
                    }
                    else{
                        rows.put(i, new HashSet<>());
                        rows.get(i).add(board[i][j]);
                    }
                    if(columns.containsKey(j)){
                        if(columns.get(j).contains(board[i][j])){
                            return false;
                        }
                        columns.get(j).add(board[i][j]);
                    }
                    else{
                        columns.put(j, new HashSet<>());
                        columns.get(j).add(board[i][j]);
                    }
                    String s = i/3+","+j/3;
                    if(squares.containsKey(s)){
                        if(squares.get(s).contains(board[i][j])){
                            return false;
                        }
                        squares.get(s).add(board[i][j]);
                    }
                    else{
                        squares.put(s, new HashSet<>());
                        squares.get(s).add(board[i][j]);
                    }

                }
            }
        }
        return true;
    }
}
