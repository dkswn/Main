public class Ppt83 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2; // 문자열 3개 붙임
	
		String str5 = "JDK" + 3 + 3.0; // 실수도 그대로 이어 붙여져서 문자열이 됨
		String str6 = 3 + 3.0 + "JDK"; // 3이 산술연산자 여서 실수와 더해지고 이어붙어짐
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
	}

}
