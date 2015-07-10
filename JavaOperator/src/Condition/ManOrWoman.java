package Condition;

import java.util.Scanner;

/*
 * @ Date : 2015. 07.10
 * @ Author : me
 * @ Story : switch 예제(남성 판별)
 * */
public class ManOrWoman {
	public  void ssn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민 번호를 입력 하세요.(예940805-2123456)");
		String msg="", ssn = scanner.next();
		/*
		 * charAt(n) 이 메소드는 0 부터 시작하여 n 번째 글자 하나만 출력하는데,
		 * 출력 결과를 프로그래밍 에서는 return 값이 라 한다.
		 * 위 예 같은 상황에서는 리턴값이 2가 된다.
		 * */
		char ch = ssn.charAt(7);
		/*
		 * ssn(주민번호) 체계
		 * 뒷자리 첫번째 숫자가
		 * 1,3 이면 남자
		 * 2,4 이면 여자
		 * 5 이면 외국인
		 * 그외 이면 잘못입력한 값
		 * */
		switch (ch) {
		case '1': case '3': msg = "남자"; break;
		case '2': case '4': msg = "여자"; break;
		case '5': msg = "외국인";	
		default: msg = "잘 못 입력 된 값"; break;
		}
		System.out.println("입력하신 SSN은 "+msg+"입니다.");
	}
}
