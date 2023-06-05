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


    int row = matrix.length; // number of rows
    int column = matrix[0].length; // number of columns

    int[] rowArr = new int[row]; // row array
    int[] colArr = new int[column]; // column array

    // Traverse the matrix:
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            if (matrix[i][j] == 0) {
                // mark ith index of rowArr with 1:
                rowArr[i] = 1;

                // mark jth index of colArr with 1:
                colArr[j] = 1;
            }
        }
    }

    // Finally, mark all (i, j) as 0
    // if rowArr[i] or colArr[j] is marked with 1.
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            if (rowArr[i] == 1 || colArr[j] == 1) {
                matrix[i][j] = 0;
            }
        }
    }
    

