import java.io.*;

public class SquareCubeRoot {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
	
		int num = Integer.parseInt(br.readLine());
		System.out.println("\nSquare Root of " + num + " = " + Math.sqrt(num));
		System.out.println("\nCube Root of " + num + " = " + Math.cbrt(num));
		
	}

}