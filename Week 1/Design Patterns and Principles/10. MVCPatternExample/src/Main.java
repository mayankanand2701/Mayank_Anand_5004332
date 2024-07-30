// Step 5
public class Main
{
	public static void main(String[] args)
	{
		// Creating a student
        Student model = StudentFromDatabase();

        // Creating a view to display student details
        StudentView view = new StudentView();

        // Creating a controller
        StudentController controller = new StudentController(model, view);

        // To display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Raj Singh");
        controller.setStudentGrade("A");

        // To display updated student details
        controller.updateView();
    }
	 private static Student StudentFromDatabase()
	 {
		 Student student = new Student();
	     student.setName("Kajal Kuamri");
	     student.setId("1001");
	     student.setGrade("B");
	     return student;
	 }
}
