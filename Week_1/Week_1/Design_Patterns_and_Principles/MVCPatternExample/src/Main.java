public class Main {
    public static void main(String[] args) {
        // Model
        Student student = new Student("Anjali", "STU1023", "A");

        // View
        StudentView view = new StudentView();

        // Controller
        StudentController controller = new StudentController(student, view);

        // Display initial student info
        controller.updateView();

        // Update data using controller
        controller.setStudentName("Anjali Sharma");
        controller.setStudentGrade("A+");

        // Display updated info
        controller.updateView();
    }
}
