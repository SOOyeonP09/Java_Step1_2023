package chapter06;

public class Subway {

	// 멤버변수
	public String lineNumber;
	public int passengerCount;
	public int money;// 지하철 수입

	// 디폴트 생성자는 생략상태

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {// 승객이 낸 돈
		this.money += money;// 지하철의 수입이 증가되고있는 상태
		passengerCount++;// 승객 수
	}

	public void showInfo() {// 지하철의 정보를 출력

		System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");

	}

}
