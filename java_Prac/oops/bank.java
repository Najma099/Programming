
public class bank {
    String name;
    private long acno;
    int balance;

    public bank(String naam,long ano,int bal)
    {
        name=naam;
        balance=bal;
    }
    public long getacno()
    {
        return acno;
    }
    public void setacno(long ano)
    {
        acno=ano;
    }
}
