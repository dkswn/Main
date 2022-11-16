
public class ch1 {
	public static void main(String[] args) {
		int num = 2;

		if (num > 9) {
			System.out.println("A");
		} else if(num > 7) {
			System.out.println("C"); //false 면 else
		} else {
			System.out.println("D");
		}						//if 와 else if 가 true여도 A절에서 충족되기때문에
		//                       A만 출력하고 바로 B로 넘어가서 출력
		System.out.println("B");
	}

}
//중간에 조건이 없는 else를 입력하면 오류남