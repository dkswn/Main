
public class Ppt77 {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y; // int 범위초과
		long lz1 = (long)x * (long)y; // 타입전환 후 롱타입이 됨
		long lz2 = (long)(x * y); //사칙연산에서 범위 오버 후 타입변환해서 범위 안나옴
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}

}
