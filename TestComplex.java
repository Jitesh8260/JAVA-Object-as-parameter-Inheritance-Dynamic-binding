
public class TestComplex{
    public static void main(String args[]){
    Complex c1=new Complex();
    Complex c2=new Complex(1,5);
    Complex c3=new Complex();
    System.out.println("Addition =");
    c3.addComplex(c1.real,c1.imaginary,c2.real,c2.imaginary);
      System.out.println("Subtraction =");
    c3.subComplex(c1.real,c1.imaginary,c2.real,c2.imaginary);
    System.out.println("Multiplications");
    c3.mulComplex(c1.real,c1.imaginary,c2.real,c2.imaginary);
    System.out.println("Division");
    c3.divComplex(c1.real,c1.imaginary,c2.real,c2.imaginary);
    }
}

class Complex {
    float real;
    float imaginary;
Complex(){
    real=1;
    imaginary=1;
}
Complex(float r,float i){
    real=r;
    imaginary=i;
}
void addComplex(float r1,float i1,float r2, float i2)
{
    System.out.println((r1+r2)+"+"+(i1+i2)+"i");
}
void subComplex(float r1,float i1,float r2, float i2)
{
    System.out.println((r1-r2)+"+"+"("+(i1-i2)+")"+"i");
}
void mulComplex(float r1,float i1,float r2, float i2)
{
    System.out.println((r1*r2)+(r2*i1+r1*i2)+"i"+(i1*i2*(-1)));
}
void divComplex(float r1,float i1,float r2, float i2)
{
    System.out.println((r1/r2)+"+"+(i1/i2)+"i");
}
}
