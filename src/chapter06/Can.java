package chapter06;


public class Can {
	
	//필드
	private String canName;
	private int price;
	
	/*
	 	can[0]=new Can("환타",1000);
		can[1]=new Can("콜라",2000);
		can[2]=new Can("사이다",3000);
		can[3]=new Can("참이슬",4000);
		can[4]=new Can("진로",5000);
	 	ㄴ> 가 들어가 있다. 이걸 Vending으로 가져가야하는데 get으로 가져간다.
	*/
	
	// 생성자 오버로딩
	public Can(String canName, int price) {
		this.canName = canName;
		this.price = price;

	}

	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}

}
