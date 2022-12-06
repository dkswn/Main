import java.util.Scanner;

	 class opgg(int num) {
		Main7 m = new Main7();
		int inp = 0;
		for (int i = 1; i <= num; i++) { // i와 j가 3행 3열로 돌아가고
			for (int j = 1; j <= num; j++) {
				inp = i * j; // inp변수를 초기화 한 후 행과 열을 곱하여 같은 열과 행을 만듬
				System.out.print(inp + " ");
			}
			System.out.println();
		}

	}

	public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
	}
}