public class HCF {
    public static int findHCF(int numbers[]){
        int hcf = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            hcf = findHC( hcf ,numbers[i] ); 
        }
        return hcf;
    }

    public static int findHC(int a, int b) {
        int temp;
        while ( b != 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return temp;
    }
}
