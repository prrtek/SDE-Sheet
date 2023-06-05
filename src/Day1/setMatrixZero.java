package Day1;

public class setMatrixZero {
    public static void main(String[] args) {
        
            public void setZeroes(int[][] matrix) {
                for(int i=0;i<matrix.length;i++){
                    for(int j=0;i<matrix[i].length;j++){
                        if(matrix[i][j]==0){
                            row(matrix,i);
                            column(matrix,j);
                        }
                    }
                }
                for (int row = 0; row < matrix.length; row++) {
                    for (int col = 0; col < matrix[row].length; col++) {
                        if (matrix[row][col] == -1) {
                            matrix[row][col] = 0;
                        }
                    }
                }
            }
            public void row(int[][]matrix,int i){
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j]!=0){
                        matrix[i][j]=-1;
                    }
                }
            }
            public void column(int[][]matrix,int j){
                 for(int i=0;j<matrix.length;i++){
                    if(matrix[i][j]!=0){
                        matrix[i][j]=-1;
                    }
                }
            }
        }
    }
    

