public class StudentInfo2 {
    String name= "Pasindu Shantha";
    String address= "No20, P.H.Sumanadasa rd, Kaluwadumulla, Ambalangoda";
    int age=22;
    public static void main(String[] args) {
        System.out.println("STUDENT INFORMATION");
        System.out.println("--------------------");
        StudentInfo2 student = new StudentInfo2();
        System.out.println("NAME:\t " + student.name);
        System.out.println("ADDRESS: " + student.address);
        System.out.println("AGE:\t " + student.age);
        System.out.println("--------------------");
    }
}
