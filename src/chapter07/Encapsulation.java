package chapter07;

public class Encapsulation {
	
	private int Side;
	private int Hight;
	
	public Encapsulation() {
		Side=0;
		Hight=0;
	}
	
	public int Cal_Area(int S,int H) {
		Side=S;
		Hight=H;
		
		return(S*H);
	}

}
