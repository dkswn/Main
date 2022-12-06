package q617;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		

		for (int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		float avg = sum/4;
		System.out.printf("sum %d\n", sum);
		System.out.printf("avg %1.0f\n", avg);
		sc.close();

	}

}
