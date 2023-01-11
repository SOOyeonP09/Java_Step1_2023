package chapter06;

import javax.swing.JOptionPane;

public class AccessTest {
	
	// 필드
	private int aa;
	public int bb;
	int cc;

	// 디폴트 생성자

	// 메서드
	public void SetAa(int aa) {
		this.aa = aa;
	}

	public void SetBb(int bb) {
		this.bb = bb;
	}

	public void SetCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		System.out.println("aa값 : " + aa + "\nbb값 : " + bb + "\ncc값 : " + cc);
	}

	public static void main(String[] args) {
		// 객체(obj)

		AccessTest obj = new AccessTest();

		obj.aa = Integer.parseInt(JOptionPane.showInputDialog("aa값 입력"));
		obj.bb = Integer.parseInt(JOptionPane.showInputDialog("bb값 입력"));
		obj.cc = Integer.parseInt(JOptionPane.showInputDialog("cc값 입력"));

		obj.Disp();

	 	/*쌤풀이
	 	obj.SetAa(10);
	 	//obj.aa=10;
	 	obj.SetBb(20);
	 	obj.SetCc(30);
	 	obj.Disp();
	 	*/
	}

}
