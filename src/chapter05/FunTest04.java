package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void Disp(String A[]) {
		String res="";
		
		for(int i=0;i<A.length;i++) {
			res += A[i]+"\n";
		}//for
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "배열의 원소값\n\n");
		
	}
	

	public static void main(String[] args) {
		String str[]= {"Java","Oracle","Jsp","Html5, Css, Js, Jq","SprintBoot","PythonCamp"};
		
		Disp(str);
	}

}
