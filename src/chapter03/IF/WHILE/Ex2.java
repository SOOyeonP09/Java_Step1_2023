package chapter03.IF.WHILE;

import javax.swing.JOptionPane;

public class Ex2 {

//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[]={"ab111","cd222","ef333","gh444","ij555"};
		String res="";
		int i;
		for(i=0; i<str.length; i++)
			res=res+str[i]+"\n";
		System.out.println(res);
		
		JOptionPane.showMessageDialog(null,"배열원소의 값" +res);
	}

}
