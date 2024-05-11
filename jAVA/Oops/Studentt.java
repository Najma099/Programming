public class Studentt {
    String name;
    int rollno;
    float percentage;
    public Studentt(String naam, int roll,int per)
    {
        name= naam;
        rollno=roll;
        percentage=per;
    }

    public int getrollno()
    {
        return rollno;
    }
    public void setrollno(int roll)
    {
        rollno=roll;
    }
}
