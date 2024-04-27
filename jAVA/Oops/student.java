public class student {
    public static class Student{
        String name;
        int rno;
        double percent;
    }
   public static void main(String[] args) {
        Student x= new Student();
        x.name ="Najma";
        x.rno =21;
        x.percent =93.4;
        System.out.println(x.percent);

        Student y= new Student();
        y.name="Deepali";
        y.rno=34;
        y.percent=95.4;
        System.out.println(y.name);
   } 
}
