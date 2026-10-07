//constructor are speical member fruction which is ussed to initialized  the data member(variable) of a class
// a contructor has the same name as the class
// constructor has not return type not even "void"
// constructor are automatically involed (call) as soon as the object of its class is created

// type of constructor c++
// 1. Default constructor 
//2. parameter (argument) construtor 
//3. copy constructor 



// type of constructor java
// 1. Default constructor 
//2. parameter (argument) construtor 


import java.util.Scanner;
 class add
 {
    int a, b ;
    // add () // default
    // {
    //     a = 0 ; 
    //     b = 0;
        
    // }
    add (int x, int y) // paramerter
    {
        a = x ;
        b = y;

    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        a = sc. nextInt();
        System.out.println("Enter a second number :");
        b= sc.nextInt();

    }
    void display () 
    {
        System.out.println("a = " + a + b + " +b ");


    }
    void output ()
    {
        int c ;
        c= a+ b;
        System.out.println("Addition = " +c  );



    }
}
class demo 
{
    public static void main(String[] args) {
        add aa  = new add();
        aa.display();
        aa.input();
        aa.output();
    }

 }
