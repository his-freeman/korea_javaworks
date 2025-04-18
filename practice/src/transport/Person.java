package transport;

public class Person {
	private String name;
	private int money;
	
	//생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//버스를 타는 메서드
	public void takeBus(Bus bus, int fee) {
		bus.take(fee);
		this.money -= fee;  //this.money = this.money - fee
	}
	
	//사람의 정보 출력
	public void personInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
