package introduction_to_java.Patterns;
import java.util.*;
public class DiamondOfStars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int spaces = n - 1;
        int stars = 1;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            // if loop means we are still above the middle so spaces will be decreased and stars will increase to move towards the middle row
            if (i < n / 2 + 1) {
                spaces--;
                stars += 2;
            } 
            // else loop means we are below the middle and we increase the no of spaces and decrease no of stars to move away from middle row
            else {
                spaces++;
                stars -= 2; 
            }
            i++;
        }
	}
}
