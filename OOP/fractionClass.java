package OOP;
class fraction {
    int num ;
    int dem;


fraction (int num,int dem){
    this.num = num;
    this.dem = dem;
}
void print(){
    System.out.println(num+"/"+dem);
    
}
void add(fraction f){
    num = num*f.dem + dem*f.num;
    dem = dem * f.dem;
}
void mulitply(fraction f){
    num = num * f.num;
    dem = dem* f.dem;
}
void deivide(fraction f){
    num = num * f.dem;
    dem = dem* f.num;
}
}

public class fractionClass {
    public static void main(String[] args) {
        fraction f1 = new fraction(3,7);
        f1.print();
        fraction f2 = new fraction(7, 3);
        f1.add(f2);
        f1.print();
        f1.mulitply(f2);
        f1.print();
        f1.deivide(f2);
        f1.print();
        
    }
    
}
