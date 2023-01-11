package chapter06;

public class TeamGroup {

	// 멤버변수
	private TeamMember member[] = new TeamMember[6];

	// 기본생성자

	// 초기화 메소드
	public void init() {// init - 초기화 이니셜이라고 함
		member[0] = new TeamMember("박수연", "여");
		member[1] = new TeamMember("백유기", "남");
		member[2] = new TeamMember("장세나", "여");
		member[3] = new TeamMember("박범준", "남");
		member[4] = new TeamMember("김창우", "남");
		member[5] = new TeamMember("김우태", "남");

	}

	// 출력 메소드
	public void Disp() {// Display-출력
		System.out.println("[팀원 명단]");
		for (int i = 0; i < member.length; i++) {
			System.out.print("성명 : " + member[i].getName());
			System.out.println("\t성별 : " + member[i].getGender());

		}
	}

}
