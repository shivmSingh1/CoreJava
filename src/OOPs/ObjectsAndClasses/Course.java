package OOPs.ObjectsAndClasses;

public class Course {
   String courseName;
   int enrolledStudents=0;
   static int maxCapacity=100;
   String[] Students= new String[maxCapacity];




    void enrollStudent(String StudentName){
        Students[enrolledStudents]=StudentName;
        System.out.printf("%s enrolled \n",Students[enrolledStudents]);
        enrolledStudents++;
    }

    void unEnrollStudent(){
        System.out.printf("%s unEnrolled \n",Students[enrolledStudents]);
        enrolledStudents--;
    }

    public static void main(String[] args) {
        Course course= new Course();
        course.enrollStudent("Shivam");
        course.enrollStudent("Akash");
        course.enrollStudent("Aman");
        course.unEnrollStudent();


        for(int i=0;i<course.enrolledStudents;i++){
            System.out.println(course.Students[i]);
        }
    }

}
