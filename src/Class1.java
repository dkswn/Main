import java.util.Scanner; // 스캐너를 사용하기 위해 추가

public class Class1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 입력해주세요 ");	
//		String input = scanner.nextLine();
		//두자리에 정수를 하나 입력해주세요를 저장
		scanner.close();	
		// nextline 은 공백 포함 표현해주고
		//  next는 띄어쓰기 전까지만 출력해줌
//		int num = Integer.parseInt(input); // 입력받은 문자열을 슷자로 변환
		//input은 정수값을 입력 받는 방법 
//		double input = Scanner.nextLine();
		char input = scanner.next().charAt(0); // 숫자열 중 0번을 때서 char input에 저장
		scanner.close();
		
		System.out.println("입력내용 :"+input);

	
	
	}

}
