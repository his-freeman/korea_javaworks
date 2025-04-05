package nestedfor;

public class ForForEx {

	public static void main(String[] args) {
		// 중첩 for문
		// 5행 5열
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.println("*");
			}
			System.out.println(); //행 바꿈
		}
		
		/*
		   연속된 숫자 채우기
		   1 2 3 4
		   5 6 7 8
		   9 10 11 12
		 */
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				int num = i*5+j;
				if((i*5+j) > 23)
					break;
				System.out.println(num + " ");
			}
			System.out.println(); //행 바꿈
		}
		System.out.println();
	}

}
