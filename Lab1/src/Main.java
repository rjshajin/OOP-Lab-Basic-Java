//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("|[[[[[[[[[[]]]]]]]]]]]]|");
        System.out.println("|[[Hello and welcome!]]|");
        System.out.println("|[[[[[[[[[[]]]]]]]]]]]]|");
        System.out.println("This is my first Java program of My day1 OOP Lab");
        System.out.println("-----------------------------------------------------------------------------------------");
        Student obj1 = new Student();
        Teacher obj2 = new Teacher();
        obj1.name = "Raofin Jahan Shajin";
        obj1.id="241-15-731";
        obj1.cgpa=3.75f;
        obj2.name = "Nasima Islam Bithi";
        obj2.age = "Unknown";
        obj2.gender = "Female";
        obj2.phone = "Unknown";
        obj2.email ="Unknown";
        obj2.education1 = "Mawlana Bhashani Science Technology University";
        obj2.education2 = "Bangladesh University of Engineering and Technology";
        obj2.department="Computer Science";
        obj2.designation="Lecturer in Department of CSE at Daffodil International University";
        obj1.studentDetails();
        obj1.display1();
        obj2.teacherDetails();
        obj2.display2();

    }

}
