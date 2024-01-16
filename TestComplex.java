/*Create a class called Complex for performing arithmetic on complex numbers. Complex numbers
have the form a+bi where a is real part and b is imaginary part and i=√-1.
Write a program to test your class. Use floating point variables to represent the private data of the
class. Provide constructor that enable an object to be initialized when it is declared. Provide no
argument constructor with default values in case no initializers are provided. Provide public
methods for addition, subtraction, multiplication and division of complex numbers. Pass objects of
Complex as parameters of the method.
Input and Output Requirements:
Program reads real and imaginary parts of two complex numbers through keyboard and displays
their sum, difference, product and quotient as result.*/

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
    System.out.println("Divi sion");
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
