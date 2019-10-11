package Tugas3Asistensi;

/**
 *
 * @author tsamarahrana
 */
public class LinearEquation {
     private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    public LinearEquation(){
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
    }
    
    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    
    public void setA(int a){
        this.a=a;
    }
    
    public double getA(){
        return a;
    }
    
    public void setB(int b){
        this.b=b;
    }
    
    public double getB(){
        return b;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
    public double getC(){
        return c;
    }
    
    public void setD(int d){
        this.d=d;
    }
    
    public double getD(){
        return d;
    }
    
    public void setE(int e){
        this.e=e;
    }
    
    public double getE(){
        return e;
    }
    
    public void setF(int f){
        this.f=f;
    }
    
    public double getF(){
        return f;
    }
    
    public boolean cekSolusi(){
        if((a*d)-(b*c)==0)
            return true;
        else
            return false;
    }
    
    public void Hasil(){
        double hasil;
        hasil = ((a*d)-(b*c));
        if(hasil == 0){
            System.out.println("Sistem tidak memiliki penyelesaian");
        }
        else{
            System.out.println("Hasilnya : ");
            System.out.println("x = " + String.format("%.2f",HasilX()));
            System.out.println("y = " + String.format("%.2f",HasilY()));
        }
    }
    
    public double HasilX(){  
        return ((e*d)-(b*f))/((a*d)-(b*c));
    }
    
    public double HasilY(){
        return ((a*f)-(e*c))/((a*d)-(b*c));
    }
    
    public void printInfo(){
        System.out.println("Sistem Persamaan nya : " + "\n" + a + " x " + b +"y " + " = " + e +"\n"+ c + " x " + d +"y" + " = " + f);
    }
}
