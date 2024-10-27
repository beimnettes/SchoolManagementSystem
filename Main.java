package week5;

public class Main {
    public static void main(String[] args) {
        // Create School
        School school = new School("Springfield High");

        // Create Departments
        Department science = new Department("Science");
        Department math = new Department("Mathematics");

        // Add departments to school
        school.addDepartment(science);
        school.addDepartment(math);

        // Create Teachers and Students for Science Department
        science.addTeacher(new Teacher("Mr. Smith", "Biology"));
        science.addTeacher(new Teacher("Mrs. Jones", "Chemistry"));
        science.addStudent(new Student("John Doe", "Grade 10"));
        science.addStudent(new Student("Jane Doe", "Grade 12"));
        science.addStudent(new Student("Jim Beam", "Grade 11"));

        // Create Teachers and Students for Mathematics Department
        math.addTeacher(new Teacher("Mr. White", "Calculus"));
        math.addTeacher(new Teacher("Ms. Black", "Algebra"));
        math.addStudent(new Student("Tim Cook", "Grade 10"));
        math.addStudent(new Student("Ann Taylor", "Grade 11"));
        math.addStudent(new Student("Gary Oak", "Grade 12"));

        // Print School details
        System.out.println("School: " + school.getName());
        for (Department department : school.getDepartments()) {
            System.out.println("Department: " + department.getName());

            System.out.println("  Teachers:");
            for (Teacher teacher : department.getTeachers()) {
                System.out.println("    " + teacher.getName() + " (" + teacher.getSubject() + ")");
            }

            System.out.println("  Students:");
            for (Student student : department.getStudents()) {
                System.out.println("    " + student.getName() + " (" + student.getGradeLevel() + ")");
            }
        }
    }
}
