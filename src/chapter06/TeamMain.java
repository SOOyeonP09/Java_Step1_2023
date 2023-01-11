package chapter06;

import java.security.PublicKey;

public class TeamMain {

	public static void main(String[] args) {

		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		// 메소드를 통해서 팀명을 초기화

		t.setTeamName("한라봉");
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("-------[팀원 명단]-------");
		team.init();
		team.Disp();

		System.out.println();
		t.setmName("김창우");
		System.out.println("팀장 : " + t.getmName());
		t.setMphone("010-2482-5660");
		System.out.println("팀장번호 : " + t.getMphone());
		t.setsName("백유기");
		System.out.println("부탐장 : " + t.getsName());

	}
}
