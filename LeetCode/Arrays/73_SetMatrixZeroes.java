class Solution {
    public void setZeroes(int[][] matrix) {

        ArrayList<Integer> col = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            boolean flag= false;
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    col.add(j);
                    flag= true;
                }
            }
            if(flag){
                for(int k=0;k<matrix[0].length; k++){
                    matrix[i][k]=0;
                }
            }
        }

        for(int i=0; i<col.size(); i++){

            for(int j=0; j<matrix.length; j++){
                matrix[j][col.get(i)]=0;
            }
        }
        
    }
}