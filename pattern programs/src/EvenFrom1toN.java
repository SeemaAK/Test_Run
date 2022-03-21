import java.util.*;
public class EvenFrom1toN {
	public static void main (String[]args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the range of even no : ");
		num=scan.nextInt();
		scan.close();
		for (int i = 1 ; i <= num ; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
