
public class Runner {
	
    
	public static void main(String[] args) {
		
		MatrixMultiplier calculator = new MatrixMultiplier();
		
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {16}, {12} };
        
        int[][] K = { {3, 5}, {1, 6} };
        
        r1 = K.length;
        c1 = K[0].length;
        c2 = secondMatrix[0].length;
        // Mutliplying Two matrices
        int[][] product = calculator.multiplyMatrices(K, secondMatrix, r1, c1, c2);

        // Displaying the result
        calculator.displayProduct(product);
    }
}
