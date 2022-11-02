
public class Ppt75 {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1); 	
		//산출타입 int (char)을 사용하는 이유는 int를 char타입으로 넣을 수없다
		//비트반전 연산자는 산출 타입은 int타입으로 된다
		
		System.out.println("c1 : " + c1); // 65(A)+1=> 66(B)
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}

}
