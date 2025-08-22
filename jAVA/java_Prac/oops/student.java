
public class student {
    String name;
    int rollno;
    double percentage;
    final String Schoolname="BMS";
    private static int numberofstudent;

    public student(String name,int rollno,double percentage)
    {
        this.name= name;
        this.rollno=rollno;
        this.percentage=percentage;
        numberofstudent++;
    }
    public static int getnumberofstudent()
    {
        return numberofstudent;
    }
}
