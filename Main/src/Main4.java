import java.util.*; // 7 난쟁이 

public class Main4 {
	public static void main(String[] args) {
		int[] smallhuman = new int[9];
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int sum1 = 0;
		int max1 = 0;
		int max2 = 0;
		for(int i=0; i<smallhuman.length; i++) {
			sum += smallhuman[i];
		}
		
		int a = 0; int b=0;
		for (int i = 0; i < smallhuman.length; i++) {
			for(int j = 0; j < smallhuman.length; j++) {
				smallhuman[i] = sc.nextInt();
				if(sum-smallhuman[i]-smallhuman[j]==100) {
					System.out.println(smallhuman[i]+ smallhuman[j]);
				}
				
				
				
			
				}
				
				
			}
			
		}
	}


