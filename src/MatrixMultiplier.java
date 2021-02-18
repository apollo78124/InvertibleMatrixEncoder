
public class MatrixMultiplier {
	
	public int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public void displayMatrix(int[][] product) {
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
    
    public int[][] inverseKey(int[][] input) {
    	int[][] output = new int[2][2];
    	int det = input[0][0] * input[1][1] - input[0][1] * input[1][0];
    	output[0][0] = input[1][1] * 25;
    	output[0][1] = -input[0][1] * 25;
    	output[1][0] = -input[1][0] * 25;
    	output[1][1] = input[0][0] * 25;
    	
    	output[0][0] = Math.floorMod(output[0][0], 27);
    	output[0][1] = Math.floorMod(output[0][1], 27);
    	output[1][0] = Math.floorMod(output[1][0], 27);
    	output[1][1] = Math.floorMod(output[1][1], 27);
    	
        return output;
    }
    
}
