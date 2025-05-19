public class Student {
    public String id;
    public String name;
    public float cgpa;
    public void studentDetails() {
        System.out.println("Student Details: ");
    }
    void display1(){
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Student Name: " + name);
        System.out.println("Student ID  : " + id);
        System.out.println("Student CGPA: " + cgpa);
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
