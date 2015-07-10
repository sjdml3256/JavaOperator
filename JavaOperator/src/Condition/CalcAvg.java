package Condition;

import java.util.Scanner;

public class CalcAvg {
	public void Calc(){
		
				int kor=0,eng = 0,math=0,total=0,avg=0;
				String name = "",pass ="";
				
				Scanner scanner = new Scanner(System.in);
				/*		
				System.out.println("이름을 입력하세요");
				name = scanner.next();
				System.out.println("국어 점수를 입력하세요");
				kor = scanner.nextInt();
				System.out.println("영어 점수를 입력하세요");
				eng = scanner.nextInt();
				System.out.println("수학 점수를 입력하세요");
				math = scanner.nextInt();
		*/
				System.out.println("이름을 입력하세요");
				name = scanner.next();
				System.out.println("국어 영어 수학 점수를 입력하세요");
				kor = scanner.nextInt();
				eng = scanner.nextInt();
				math = scanner.nextInt();
				
				total = kor + eng + math;
				avg = total/3;
				
				System.out.println(" 		학생		국어		영어		수학		총점		평균		합격여부\n	"
					+ "   -----------------------------------------------------------------------------------------------------------------");
				
				if (avg>=90) {
					pass = "장학생";
				}
				else if (avg>=70 && avg<90) {
					pass = "합격";
				}
				else {
					pass = "불합격";
				}
				System.out.println("\t\t("+name+")\t\t("+kor+")\t\t("+eng+")\t\t("+math+")\t\t("+total+")\t\t("+avg+")\t\t("+pass+")");
	}
}
