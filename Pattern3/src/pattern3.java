// // pattern for triangle
// 	  	   *
//        * *
//       * * *
//      * * * *
import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rows : ");
		int rows = sc.nextInt();
		int i, j, k;
		for(i = 0; i < rows; i++) {
			for(j = i; j < rows; j++) {
				System.out.print(" ");
			}
			for(k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
