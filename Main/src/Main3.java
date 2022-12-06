import java.util.*;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int cnt = 0;
		double  avg = 0;
		
		while(true) {
			int inp = sc.nextInt();
			if((0>inp) || (inp > 100) ) {
				break;
			}
				
			sum = +inp;
			cnt++;
				
		}
		avg = (double)sum / cnt;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double)avg);
	}

}
