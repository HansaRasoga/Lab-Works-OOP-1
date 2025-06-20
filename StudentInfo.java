public class StudentInfo {
    String name;
    String address;
    int age;
    public static void main(String[] args) {
        System.out.println("STUDENT INFORMATION");
        System.out.println("--------------------");
        StudentInfo student = new StudentInfo();
        student.name = "Oshani Deshappriya";
        student.address = "123 Main Street, Bandaragama";
        student.age = 22;
        
        System.out.println("NAME:\t " + student.name);
        System.out.println("ADDRESS: " + student.address);
        System.out.println("AGE:\t " + student.age);
        System.out.println("--------------------");

}
}
