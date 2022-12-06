import java.util.Scanner;
public class Main14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();			
		sc.close();
		
		System.out.println(N);
		
		int r = 1, m = 1;
		while(true) {
			if(N <= r) {
				break;
			}
			r = r + 6 * m++;
		}
		System.out.println(m);
											// 1 -> 1
											// 2 ~ 7 ->2(6)
											// 8 ~ 19 ->3(12)
											// 20~ 37 -> 4(18)
				
		}
			
		

	}


