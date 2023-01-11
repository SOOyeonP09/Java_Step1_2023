package chapter03.IF;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);			   // Scanner 클래스 선언
		
		String ID = "soldesk";						       // 저장된 아이디 변수 선언
		int PW = 1234; 									   // 저장된 비밀번호 변수 선언
		String input_id, input_password; 				   // 입력받는 아이디 , 비밀번호 변수 선언

		System.out.print("아이디를 입력해주세요 : ");		   
		input_id = scan.nextLine();				
		
		if (ID.equals(input_id)) {
			System.out.print("비밀번호를 입력해주세요 : ");
			input_password = scan.nextLine();
			
			int input_pw_i = Integer.parseInt(input_password);
			if (PW == input_pw_i) {							
				System.out.println("로그인 성공");
				} else {
					System.out.print("입력하신 비밀번호는 " + input_password + "입니다. ");
					System.out.println("비밀번호를 확인해주세요.");
				}
		}
		else {														
			System.out.println("아이디를 확인해주세요.");
		}
	}
}
		
//	String ID="soldesk"; // 인스턴스 변수
//	int PW = 221227;	 // 정수형 변수
//	String PW1 = "221227";
	
//	String id=JOptionPane.showInputDialog("아이디를 입력하세요.");
//	String pass=JOptionPane.showInputDialog("비밀번호를 입력하세요.");

//	if (ID.equals(id)) {
//		if(PW==pass) {
//			JOptionPane.showMessageDialog(null, "로그인 성공");
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
//		}
//	}
//	else{
//		if(PW==pass) {
//			JOptionPane.showMessageDialog(null, "아이디를 확인하세요.");
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인해주세요.");
//		}
//	}
//	
//	if (ID.equals(id)) {
//		if(PW1.equals(pass)) {
//			JOptionPane.showMessageDialog(null, "로그인 성공");
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
//		}
//	}
//	else{
//		if(PW1.equals(pass)) {
//			JOptionPane.showMessageDialog(null, "아이디를 확인하세요.");
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인해주세요.");
//		}
//	}
	
//	String[] sel_message= {
//			"1번째",
//			"2번째",
//			"3번째"
//	};
//	
//	String input = (String)JOptionPane.showInputDialog(
//			null,
//			"셀렉트박스로 값을 선택하세요",
//			"제목표시줄 입니다.",
//			JOptionPane.INFORMATION_MESSAGE,
//			null,
//			sel_message,
//			"?" // <-- 존재해야하는 이유 ?
//			);
//	System.out.println(input);
	//String PW="1234";
	
	
	// Scanner scan이라는 인스턴스 변수 선언
	// ID라는 변수로 아이디 받기
	// PW라는 변수로 비번 받기(string) => 숫자로 받되 String으로 변환
	// int형으로 형변환
	// 중첩질의를 사용하여 로그인 성공과 비밀번호 다름, 아이디 없음
//		if (ID.equals(input_id) && PW == input_pw_i) {
//			System.out.println("로그인 성공");
//		}
//		
//		if (ID.equals(input_id) && PW != input_pw_i) {
//			System.out.println("비밀번호를 확인해 주세요.");
//		}
//		
//		if (!(ID.equals(input_id)) && PW == input_pw_i) {
//			System.out.println("아이디를 확인 해주세요.");
//		}
//		
//		if (!(ID.equals(input_id)) && PW != input_pw_i ) {
//			System.out.println("아이디와 비밀번호를 확인해주세요.");
//		}
//		System.out.print("아이디를 입력해주세요 : ");		   
//		input_id = scan.nextLine();						   // 아이디 입력
//		System.out.print("비밀번호를 입력해주세요 : ");
//		input_password = scan.nextLine();				   // 비밀번호 입력

//		int input_pw_i = Integer.parseInt(input_password); // 문자열로 받은 비밀번호를 정수형으로 변환

//		if (ID.equals(input_id)) {
//			
//			System.out.print("비밀번호를 입력해주세요 : ");
//			input_password = scan.nextLine();
//			
//			int input_pw_i = Integer.parseInt(input_password);
//			System.out.print("입력하신 비밀번호가 " + input_password + " 맞나요? ");
//			
//			if (PW == input_pw_i) {							// 저장된 비밀번호 == 입력한 비밀번호
//				System.out.println("로그인 성공");
//			} else {										// 저장된 비밀번호 != 입력한 비밀번호
//				System.out.println("비밀번호를 확인해주세요.");
//			}
//		}else {											// 저장된 아이디 != 저장된 아이디
//			if (PW == input_pw_i) {							// 저장된 비밀번호 == 저장된 비밀번호
//				System.out.println("아이디를 확인해주세요.");
//			} else {										// 저장된 비밀번호 != 저장된 비밀번호
//				System.out.println("아이디와 비밀번호를 확인해주세요.");
//			}
//		}
