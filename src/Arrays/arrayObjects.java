package Arrays;
class Student {
    int rollno;
    int marks;
    String name;
}
public class arrayObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.marks = 92;
        s1.rollno = 1;

        Student s2 = new Student();
        s2.name = "Akhilesh";
        s2.marks = 82;
        s2.rollno = 23;

        Student s3 = new Student();
        s3.name = "Arpit";
        s3.marks = 96;
        s3.rollno = 13;
        //System.out.println(s1);
        System.out.println(s1.name + " : "+ s1.marks);

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
