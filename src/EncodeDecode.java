
public class EncodeDecode {
	MatrixMultiplier calculator;
	public EncodeDecode() {
		calculator = new MatrixMultiplier();
	}
	
	public int[] stringToMatrix(String input) {
		int[] output = new int[input.length()];
		char character = input.charAt(0); // This gives the character 'a'
		int ascii = (int) character;
		System.out.println("Text to numerical vector: (Horizontally displayed to fit the console window)");
		for (int i = 0; i < input.length(); i++) {
			output[i] = input.charAt(i) - 64;
			if (output[i] < 1)
				output[i] = 0;
			if (i % 2 == 0)  {
				System.out.print("[");
				System.out.print(output[i]);
				System.out.print(", ");
			} else {
				System.out.print(output[i]);
				System.out.print("]");
			}
			
		}
		return output;
	}
	
	public String encode(String input) {
		String cipherText = "";
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
        calculator.displayMatrix(product);
		
		
		return cipherText;
	}
	
	public String decode(String input) {
		return "";
	}
}
