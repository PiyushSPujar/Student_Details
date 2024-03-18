public class Student_Course {
    public static void main(String[] args) {
        Student_Courses student01 = new Student_Courses("Piyush", 214);
        student01.semester01(93, 82);
        student01.semester02(90, 85);
        student01.semester03(92,94);
    }
}
class Student_Courses extends Student{
    String student_name;
    int student_usn;
    public Student_Courses(String name, int usn){
        this.student_name = name;
        this.student_usn = usn;
        display_details();
    }
    public void display_details(){
        System.out.println("Student name : "+ student_name);
        System.out.println("Student USN : "+ student_usn);
    }
    public void semester01(int C_Programming, int wed_Technology){
        System.out.println("First semester courses and mark :- ");
        // int C_Programming = 93;
        // int wed_Technology = 82;
        System.out.println("i. C Programming : "+ C_Programming);
        System.out.println("ii. Web Technology : "+ wed_Technology);
    }
    public void semester02(int Cpp_Programming, int FCO){
        System.out.println("Second semester courses and mark :- ");
        // int Cpp_Programming = 90;
        // int FCO = 85;
        System.out.println("i. C++ Programming : "+ Cpp_Programming);
        System.out.println("ii. FCO : "+ FCO);
    }
    public void semester03(int applied_statistics, int computer_networking){
        System.out.println("Third semester courses and mark :-");
        // int applied_statistics = 92;
        // int computer_networking = 94;
        System.out.println("i. Applied Statistics : "+ applied_statistics);
        System.out.println("ii. Computer Networking : "+ computer_networking);  }  }
