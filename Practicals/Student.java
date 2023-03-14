
public class Student {
	
	private int student_rollNumber;
	private String student_name;
	private String course;
	
	static private int student_count=1;
	
	public int getStudent_rollNumber() {
		return student_rollNumber;
	}
	public void setStudent_rollNumber(int student_rollNumber) {
		this.student_rollNumber = student_rollNumber;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Student(int student_rollNumber, String student_name, String course) {
		super();
		this.student_rollNumber = student_rollNumber;
		this.student_name = student_name;
		this.course = course;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student "+(student_count++)+" [student_rollNumber=" + student_rollNumber + ", student_name=" + student_name + ", course="
				+ course + "]";
	}
	
	
}
