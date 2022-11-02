
public class Class2 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; // Long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFL ;
		
		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10;// 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b); //%d 는 정수형태 출력
		System.out.printf("s=%d%n", s); 
		System.out.printf("c=%c, %d %n", c, (int)c); 
		//%c는 char타입출력, 타입이 두개라 두개출력, c를 인티져 타입
		System.out.printf("finger=[%5d]%n", finger); 
		//%5d 오른쪽 5자리까지 출력하겠다는 것
		System.out.printf("finger=[%-5d]%n", finger);
		//%-5d 왼쪽 5자리까지 출력하겠다는 것
		System.out.printf("finger=[%05d]%n", finger);
		// %05d 앞을 0으로 채워서 출력
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); //'#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, $d$n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum) , binNum);
				// string = %s를 출력하겠다는 의미											        
	}
}
