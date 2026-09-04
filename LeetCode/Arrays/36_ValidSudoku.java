class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(Character.isDigit(board[i][j])){
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    else{
                        set.add(board[i][j]);
                    }
                }
            }
            set.clear();
        }


        for(int j=0; j<9; j++){
            for(int i=0; i<9; i++){
                if(Character.isDigit(board[i][j])){
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    else{
                        set.add(board[i][j]);
                    }
                }
            }
            set.clear();
        }
        int k=0;

        for(int t=0; t<3; t++){

            for(int i=0; i<9; i++){
                for(int j=k;j<k+3;j++){
                    
                 if(Character.isDigit(board[i][j])){
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    else{
                        set.add(board[i][j]);
                    }
                }
                

                }
                if((i+1) %3==0){
                    set.clear();
                }
            }
            k=k+3;

        }



        return true;
    }
}