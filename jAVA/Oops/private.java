//if class is defined inside main function it connot be access outside the main function
public class private {
    public static void fun(Bank  customer1)
    {
        System.out.println(customer.name);
        return ;
    }
    public static void main(String[] args)
    {
        class Bank
        {
            String name;
            long Ac_no;
            int balance;
        }
        Bank customer1=new Bank();
        customer1.name="Deepali Kumari";
        customer1.Ac_no=86754683476478;
        customer1.balance=50000; 
        fun(customer1);  
    }
}
