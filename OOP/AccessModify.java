package OOP;

//encapsulation
class Student {
String name ;
private int rno;
double cgpa;
  void print(){
    System.out.println(name+" "+cgpa+" " + rno);
}
void setRno(int x){ // its use to private attributes 
    rno = x ;
}
   int getRno (){  // its use to private attributes 
    return rno;
}

// public void p (){  yeh apan ne baher se ander ko private function ko access karne ke liye ek function bana ke uski help li hai
//     print(); 
// }


}
public class AccessModify {


    public static void main(String[] args) {
        Student s = new Student();
        // s.print();
        s.name= "ankit";
        s.cgpa = 8.9;
        s.setRno(45);
        // s.print();
        System.out.println(s.getRno());
    
        
    }
    
}
