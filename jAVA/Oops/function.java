public class function {
    public static class Car
    {
        String name;
        int Sl_no;
        int petrol_capacity;
    }
    public static void fun(Car car1)
    {
        System.out.println(car1.Sl_no);
        return;
    }
    public static void main(String[] args) 
    {
        Car car1= new Car();
        car1.name="Audi";
        car1.Sl_no=76;
        car1.petrol_capacity=17;
        fun(car1);
        
    }
}
