package lap3;
import java.util.Scanner;
public class Fraction {
    Scanner scan = new Scanner(System.in);
    public int num;
    public int den;
    
    public Fraction(){
        this.num = 0;
        this.den = 1;
    }
    public Fraction(int n, int d){
        if(den == 0){
            System.out.println("Mau so phai khac 0");
            this.num = 0;
            this.den = 1;
        }else{
            this.num = n;
            this.den = d;            
        }
    }
    public void Fraction(Fraction f){
        do{
            System.out.println("Nhap tu so: ");
            num = scan.nextInt();
            System.out.println("Nhap mau so: ");
            den = scan.nextInt();
            if (den == 0){
                System.out.println("Mau so phai khac 0");
            }
        }while (den == 0);
    }
    public Fraction add(Fraction f2){
        int tu = num*f2.den + den*f2.num;
        int mau = den*f2.den;
        return new Fraction(tu,mau);
    }
    public Fraction sub(Fraction f2){
        int tu = num*f2.den - den*f2.num;
        int mau = den*f2.den;
        return null;
    }
    public Fraction mul(Fraction f2){
        int tu = num*f2.num;
        int mau = den*f2.den;
        return null;
    }
    public Fraction div(Fraction f2){
        int tu = num*f2.den;
        int mau = den*f2.num;
        return null;
    }
    public String toString(){
        return "Fraction["+num+"; "+den+"]";
    }
}

