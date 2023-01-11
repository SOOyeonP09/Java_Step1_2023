package chapter06;

public class TakeTrans {

	public static void main(String[] args) {

		// 학생 2명 생성
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTom = new StdInfo("Tom", 10000);

		// 버스타기
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);

		// 정보확인
		studentJames.showInfo();// 지출이 되야함
		bus100.showInfo();// 수입증가 인원수 증가가 되야함
		System.out.println("-------------------------------------");
		Bus bus987 = new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("-------------------------------------");

		// 지하철타기
		// 같은 지하철을 탔을때
		Subway subwayGreen = new Subway("2호선");
		studentJames.takeSubway(subwayGreen);
		studentTom.takeSubway(subwayGreen);
		
		//정보확인
		studentJames.showInfo();
		subwayGreen.showInfo();
		System.out.println("-------------------------------------");
		studentTom.showInfo();
		subwayGreen.showInfo();
		
		/*
		//각자 다른 지하철을 탔을때
		Subway subwayGreen=new Subway("2호선");
		studentJames.takeSubway(subwayGreen);
		Subway subwayOrange=new Subway("3호선");
		studentTom.takeSubway(subwayOrange);
		
		studentJames.showInfo();
		subwayGreen.showInfo();
		System.out.println("-------------------------------------");
		studentTom.showInfo();
		subwayOrange.showInfo();
		 */
	}

}
