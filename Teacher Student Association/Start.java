import java.lang.*;

public class Start
{
	public static void main(String []args)
	{
		Student st = new Student();
		st.setStudentName("Zahid Al Kabir");
		st.setStudentId(1738471);
		st.setDepartment("CSE");
		st.showDetails();
		System.out.println("----------------------------------");


		Teacher tc = new Teacher();
		tc.setCourse("Java");
		tc.setStudent(st);

		tc.showDetails();
		System.out.println("----------------------------------");


	    Student st1 = new Student("Manosh Talukdar", 1829841, "EEE");
	    Teacher tc1 = new Teacher("Electrical Circuit", st1);   //association
        
	    tc1.showDetails();
	    //System.out.println("The name of the student is: "+tc1.getStudent().getStudentName());  
	   // System.out.println("The dept of the student is: "+tc1.getStudent().getDepartment());


	}
}