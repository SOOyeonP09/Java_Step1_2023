package chapter06;

public class StudentInfo {

	// 필드
	int studentID;
	private String studentName;
	int grade;
	String address;

	// 생성자 생락 : free complie
	// 메소드
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}