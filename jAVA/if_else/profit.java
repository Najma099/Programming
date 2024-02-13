import java.util.Scanner;
public class profit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Cp:");
        int Cp = sc.nextInt();
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the Sp:");
        int Sp= s.nextInt();
        if(Cp>Sp)
        {
            int loss=Cp-Sp;
            System.out.print("loss:"+loss);
        }
        if(Sp>Cp){
            int profit=Sp-Cp;
            System.out.print("Profit:" +profit); 

        }
        
        if(Cp==Sp)
        {
            System.out.print("No profit no loss");
        }
    
        sc.close();
        s.close();


    }
    
}
