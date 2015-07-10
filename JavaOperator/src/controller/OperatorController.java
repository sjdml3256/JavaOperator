package controller;

import Condition.ArithmeticCalc;
import Condition.CalcAvg;
import Condition.ManOrWoman;
import Condition.Switching;

public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09 성적 계산기
		CalcAvg avg = new CalcAvg();
//		avg.calc();
		
		// 2015.07.09 사칙 연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
//		calc.calc();
		
		// 2015.07.10 성적계산기(switch)
		Switching avg2 = new Switching();
//		avg2.calc();
		
		//2015.07.10 ssn 남녀 구분(switch)
		ManOrWoman manOrWoman = new ManOrWoman();
		manOrWoman.ssn(); // ssn() 원 클래스의 메소드 이름이다.
	}
}
