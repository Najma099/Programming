public class modify {
    public static void change(Student S1)
    {
        S1.name="Deepali";
        return ;
    }
    public static class Student
    {
        String name;
        int rollno;
        float percentage;
    }
    public static void main(String[] args) {
        Student S1= new Student();
        S1.name="Najma";
        S1.rollno=87;
        S1.percentage=89.99f;
        System.out.println(S1.name);
        modify.change(S1);
        System.out.println(S1.name);
    }
}
