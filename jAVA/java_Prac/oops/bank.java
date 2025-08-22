
public class bank {
    String name;
    private long acno;
    int balance;
    //default constructure
    public bank()
    {

    }
    public bank(String name,long acno,int balance)
    {
        this.name=name;
        this.balance=balance;
    }
    public long getacno()
    {
        return acno;
    }
    public void setacno(long acno)
    {
        this.acno=acno;
    }
}
