package chapter06;

public class Bus {

	// 멤버변수
	int busNumber;
	int passengerCount;
	int money;

	// 디폴트 생성자는 생략상태

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {// 승객이 낸 돈
		this.money += money;// 버스의 수입이 증가되고있는 상태
		passengerCount++;// 승객 수
	}

	public void showInfo() {// 버스의 정보를 출력

		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");

	}
}
