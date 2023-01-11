package chapter03.IF.WHILE;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		String strArray[] = {"JAVA" , "Oracle", "Html5", "CSS", "JS", "JQ", "JSP", "Spring", "PythonCamp"};
	
//		for(int i=0; i<strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}
//		
		// 확장 for문
		for(String l : strArray ) {
			System.out.println(l);
		}
	}
}
