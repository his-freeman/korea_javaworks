package interfaces.calculater;

public class CalculaterTest {

	public static void main(String[] args) {
		// 인터페이스 타입은 객체를 생성할 수 없음
		//Calculater calc = new Calculater();
		
		//인터페이스를 구현한 클래스로 객체 생성
		MyCalculater calc = new MyCalculater();
		
		try {
			int num1 = 10;
			int num2 = 4;
		
			System.out.println(calc.add(num1, num2));
			System.out.println(calc.subtract(num1, num2));
			System.out.println(calc.times(num1, num2));
			System.out.println(calc.divide(num1, num2));
		}catch(Exception e) {
			//System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
