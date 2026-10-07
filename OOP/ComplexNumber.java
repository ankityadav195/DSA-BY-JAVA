package OOP;
class Complex {
    int n ;
    int m ;
    Complex(int n , int m){
        this.n = n; 
        this.m = m;
    }
    void print(){
        if(m>0) System.out.println(n + "+ " +m+ " i");
        else System.out.println(n +" - "+(-m)+ "i");
    }
    void add(Complex c){
        n = n+c.n;
        m = m+c.m;
    }
    void mulitply(Complex c1){
        n = n*c1.n - m*c1.m;
        m = n*c1.m + m*c1.n;

    }


}

public class ComplexNumber {
    public static void main(String[] args) {
        Complex c1 = new Complex( 3,-4);
        Complex c2 = new Complex(3, -6);
        c1.print(); c2.print();
        c1.add(c2);
        c2.print();
         c1.print(); c2.print();
         c2.mulitply(c1);
         c1.print(); c2.print();
    }
    
}
