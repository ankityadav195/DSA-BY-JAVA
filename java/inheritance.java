//Inheritance allows one class to Reuse another class’s code.

// Benefits 
//1. Reusability
//2. Code reusability
//3. Saves time and effort
//4. Easy maintenance
//5. Supports method overriding (runtime polymorphism)

//Types of inheritance
//1. Single
//2. Multilevel
//3. Hierarchical
//4. Multiple (not supported directly in Java)
//5. Hybrid (using interfaces)


// single inheritance
 // when one base class is being derived by a single drived class. then this is a called inheritance 

//  ex: A is a inherit b class

import java .util .Scanner;

class A{
    int a , b;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        a = sc.nextInt();
        System.out.println("Enter a second number :");
        b =  sc.nextInt();

    }
    void add ()
    {
        System.out.println("Addition " +( a + b));

    }

}

class B extends A
{
    int c ;
    void getdata ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        c = sc.nextInt();

    }
    void display()
        {
            System.out.println("Additoin = " + (a + b +c));

        }
    
}



class demoaa
{
    public static void main(String[] args) {
        B aa = new B();
        aa.input();
        aa.getdata();
        aa.add();
        aa.display();
    }
}

