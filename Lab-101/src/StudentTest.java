import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student's Name: ");
		Student s1 = new Student();
		s1.name = input.next();
		System.out.print("Enter Student's Grade: ");
		s1.grade = input.nextInt();
		s1.displayStudentInfo();
		System.out.print(s1.getGradeStatus());
	}
}
