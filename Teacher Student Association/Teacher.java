import java.lang.*;

public class Teacher
{
	private String course;
	private Student student; // object of student class 

	public Teacher()
	{
		System.out.println("This is empty for Teacher");
	}
	public Teacher(String course, Student student)
	{
		this.course = course;
		this.student = student;
		System.out.println("This is parameterized for Teacher");
	}

	public void setCourse(String course)
	{
		this.course = course;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	public String getCourse()
	{
		return course;
	}

	public Student getStudent() 
	{
		return student;
	}

	public void showDetails()
	{
		student.showDetails();
		System.out.println("The name of the course is: "+course);
	}




}