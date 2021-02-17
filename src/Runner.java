import java.util.ArrayList;

public class Runner {
	
    
	public static void main(String[] args) {
		MatrixMultiplier calculator;
		calculator = new MatrixMultiplier();
		EncodeDecode encoder = new EncodeDecode();
		int[][] K = new int[][]{ {3, 5}, {1, 6} };
		encoder.encode("PLEASE USE THE OTHER DOOR", K);
    }
}
