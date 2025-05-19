public class Teacher {
    public String name;
    public String age;
    public String gender;
    public String phone;
    public String email;
    public String education1;
    public String education2;
    public String department;
    public String designation;
    public void teacherDetails() {
        System.out.println("Display teacher details:");
    }
    void display2(){
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Name       :"+name);
        System.out.println("Age        :"+age);
        System.out.println("Gender     :"+gender);
        System.out.println("Phone      :"+phone);
        System.out.println("Email      :"+email);
        System.out.println("B.Sc.      :"+education1);
        System.out.println("MSc        :"+education2);
        System.out.println("Department :"+department);
        System.out.println("Designation:"+designation);
        System.out.println("------------------------------------END----------------------------------------------");

    }
}
