import java.util.ArrayList;

public class Runner {
	
    
	public static void main(String[] args) {
		MatrixMultiplier calculator;
		calculator = new MatrixMultiplier();
		EncodeDecode encoder = new EncodeDecode();
		
		/**
		 * Sender Side
		 */
		String originalMessage = "PLEASE USE THE OTHER DOOR";
		System.out.println("Original Message: ");
		System.out.println(originalMessage + "\n");
		//int[][] K = new int[][]{ {4, 3}, {3, 2} };\
		int[][] K = new int[][]{ {3, 5}, {1, 6} };
		String cipherText = encoder.encode(originalMessage, K);
		
		
		/**
		 * Receiver Side
		 */
		System.out.println("\nReceiver Side:");
		int[][] KInverse = new int[][]{ {15, 10}, {2, 21} };
		String deCodedText = encoder.decode(cipherText, KInverse);
		System.out.println("\nDecoded Message:");
		System.out.println(deCodedText);
    }
}
