public class fraction {
    
    public static class Fraction
    {
        int num;
        int den;
        public Fraction(int num,int den)
        {
            this.num=num;
            this.den=den;
        }
        public void simplify()
        {
            int hcf= gcd(num,den);
            num/=hcf;
            den/=hcf;

        }
        public int gcd(int a, int b) 
        {
            if (b == 0) 
            {
                return a;
            }
            return gcd(b, a % b);
        }
        public static Fraction add(Fraction f1, Fraction f2)
        {
            int numerator = f1.num * f2.den + f2.num * f1.den;
            int denominator=f2.den*f1.den;
            Fraction f3 = new Fraction(numerator,denominator);
            f3.simplify();
            return f3;
        }
        public static Fraction multiply(Fraction f1, Fraction f2)
        {
            int numerator= f1.num *f2.num;
            int denominator=f2.den * f2.den;
            Fraction f3= new Fraction(numerator, denominator);
            f3.simplify();
            return f3;
        }

    }
    public static void main(String[] args) {
        Fraction f1= new Fraction(8,4);
        System.out.println(f1.num+"/"+f1.den);
        f1.simplify();
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2= new Fraction(7,8);
        f2.simplify();
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3=Fraction.add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
        Fraction f4= Fraction.multiply(f1,f2);
        System.out.println(f4.num+"/"+f4.den);
    }
}
