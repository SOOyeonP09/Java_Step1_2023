package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {

		// 전시관의 입장료는 미취학 아동은 1000원
		// 전시관의 입장료는 초등학생은 2000원

		// 방법1
//		class Info {
//			String age_name;
//			int cost;
//
//			Info(String age_name, int cost) {
//				this.age_name = age_name;
//				this.cost1 = cost;
//			}
//		}
//		Info[] infors = { new Info("미취학아동", 1000), new Info("초등학생", 2000), new Info("중고등학생", 3500),
//				new Info("성인", 5000), };		
//		
//		int age, i;
//
//		age = Integer.parseInt(JOptionPane.showInputDialog("당신의 나이는"));
//		
//		if (age<=7) 
//			i=0;
//		else if(age<=13) 
//			i=1;
//		else if(age<=19)
//			i=2;
//		else 
//			i=3;
//
//		System.out.println(infors[i].name + " " + infors[i].cost + "입니다.");

//		for (Info i : infors) {
//			System.out.println(i.name + " " + i.cost1 + "입니다.");
//		}
//		

		
		
		
		// 방법 2
//		String[] cost = {"1000","2000","3500","5000"};
//		String[] age_name = {"미취학아동","초등학생","중.고등학생","성인"};

//		int age,i;
//
//		age = Integer.parseInt(JOptionPane.showInputDialog("당신의 나이는"));
//		
//		if (age<=7) 
//			i=0;
//		else if(age<=13) 
//			i=1;
//		else if(age<=19)
//			i=2;
//		else 
//			i=3;
//		System.out.println(age_name[i] + "입니다.");
//		System.out.println("입장료는 "+cost[i] + " 입니다.");

		
		
		
	}
}
