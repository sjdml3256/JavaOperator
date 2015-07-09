package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015. 07.09
 * @ Author : me
 * @ Story : 사칙연산 계산 프로그램
 */
public class ArithmeticCalc {
	/*
	 * 사칙연산 계산기
	 * 덧셈 뺄셈 곱셈 나눗셈(몫 : (), 나머지 : ())
	 * 사칙연산 기호 입렵받기
	 * 출력결과
	 * === 심플계산기 ===
	 * 5 X 5 = 25
	 * 5 + 5 = 10
	 * 6 ÷ 5 = 1 (1)
	 * 5 - 6 = -1
	 * */
//	public static void main(String[] args) {
	public void calc(){
		int fir=0, sec=0;
		String giho="";
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요.");
		fir =scanner.nextInt();
		System.out.println("연산자를 입력해 주세요.");
		giho = scanner.next();
		System.out.println("숫자를 입력해 주세요.");
		sec = scanner.nextInt();
		
		System.out.println( "=== 심플 계산기 ===");
		
		if (giho.equals("+")) {
			System.out.println(fir+" + "+sec+" = "+(fir+sec));
		}
		else if (giho.equals("-")) {
			System.out.println(fir+" - "+sec+" = "+(fir-sec));
		}
		else if (giho.equals("*")) {
			System.out.println(fir+" X "+sec+" = "+(fir*sec));
		}
		else if (giho.equals("/")) {
			System.out.println(fir+" ÷ "+sec+" = "+(fir/sec)+" "+"("+(fir%sec)+")");
		}
		else
			System.out.println("해당사항이 없습니다.");
	}
//	}
}
