
public class Class3 {
	public static void main(String[] args) {
		String ur1 = "www.codechoho.com";
		
		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e %g\n", f1, f1, f1);
		System.out.printf("f2=%f, %e %g\n", f2, f2, f2);
		System.out.printf("f3=%f, %e %g\n", f3, f3, f3);
		
		System.out.printf("d=%f\n", d);
		System.out.printf("d=%14.10f\n", d);
		// 14는 전체자리수, 소수점 아래는 10의 자리수로 채우겠다
		
		System.out.printf("[12345678901234567890]\n");
		System.out.printf("[%s]\n", ur1);
		System.out.printf("[%20s]\n", ur1);
		System.out.printf("[%-20s]\n", ur1);
		System.out.printf("[%.8s]\n", ur1);
// 지시자 종류
//		%b boolean 형식으로 출력
//		%d 10진(decimal) 정수의 형식으로 출력
//		%o 8진(octal) 정수의 형식으로 출력
//		%x, %X 16진(hex) 정수의 형식으로 출력
//		%f 부동 소수점(floating-point)의 형식으로 출력
//		%e, %E 지수(exponent) 표현식의 형식으로 출력
//		%c 문자(character) 으로 출력
//		%s 문자열(String) 로 출력
//
	}

}
