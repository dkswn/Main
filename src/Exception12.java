
public class Exception12 {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
//		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		System.out.println(z + 2);
	} // 반환할 수없는 값을 오류 대신에 NaN을 반환한다 예 음수의 제곱근, 0으로 나눈 몴

}
