import java.util.ArrayList;

public class EncodeDecode {
	MatrixMultiplier calculator;
	public EncodeDecode() {
		calculator = new MatrixMultiplier();
	}
	
	public int[] stringToNumericalArray(String input) {
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
		System.out.println("\nEnd of Numeric Array");
		return output;
	}
	
	public ArrayList<int[][]> vectorToMatrix(int[] input) {
		
		ArrayList<int[][]> output = new ArrayList<int[][]>();
		int[][] diGraph = { {0}, {0} };
		for (int i = 0; i < input.length; i++) {
			if (i % 2 ==  0) {
				if (i + 1 > input.length - 1) {
					diGraph = new int[][]{ {input[i]}, {0} };
				} else {
					diGraph = new int[][]{ {input[i]}, {input[i + 1]} };
				}
				output.add(diGraph);
			}
		}
		
		return output;
	}
	
	public String encode(String input, int[][] K) {
		String cipherText = "";
		int r1 = 0, c1 = 0;
        int r2 = 0, c2 = 0;
        
        int[] numericArray = stringToNumericalArray(input);
        ArrayList<int[][]> diGraphList = vectorToMatrix(numericArray);
        ArrayList<int[][]> transformedDiGraph = new ArrayList<int[][]>();
        
		for (int[][] diGraph : diGraphList) {
			r1 = K.length;
	        c1 = K[0].length;
	        c2 = diGraph[0].length;
	        int[][] transformed = calculator.multiplyMatrices(K, diGraph, r1, c1, c2);
	        transformedDiGraph.add(transformed);
		}
		
		for (int[][] diGraph : transformedDiGraph) {
			for(int[] row : diGraph) {
	            for (int column : row) {
	            	column  = column % 27;
	            	if (column < 1)
	            		cipherText = cipherText + "-";
	            	else 
	            		cipherText = cipherText + (char) (column + 64);
	            }
	        }
		}
		System.out.println("Encoded Cipher Text: ");
		System.out.println(cipherText);
		return cipherText;
	}
	
	public String decode(String input) {
		return "";
	}
}
