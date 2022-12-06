import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c =new char[10];
		sc.close();
		
		for(int i=0; i<c.length; i++) {
			String z = sc.next();
			c[i] = z.charAt(0);
		}
		System.out.print(c[0]+" "+c[3]+" "+c[6]);
	}

}
