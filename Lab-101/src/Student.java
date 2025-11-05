
public class Student {
	public String name;
	public int grade;
	public int hello;

	public String getGradeStatus() {
		if (grade >= 50)
			return "pass";
		return "Fail";
	}

	public void displayStudentInfo() {
		System.out.println("Student Info:"+name+", Grade:"+grade);
		
	}
}
