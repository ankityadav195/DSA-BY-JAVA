 
//  class A extends Thread
//  {
//     public void run(){
//         for (int i = 0 ; i <= 10 ; i ++){
//             System.out.print(" i = " + i );
//         }
//     }
//  }
//  class  B extends Thread
//  {
//     public void run(){
//         for (int j = 0 ; j <= 10 ; j ++){
//             System.out.print(" j = " + j   );
//         }
//     }
//  }
//  class C extends Thread
//  {
//     public void run(){
//         for (int k = 0 ; k <= 10 ; k ++){
//             System.out.print(" k = " + k );
//         }
//     }
//  }
//  class ThreadTest 
//  {
//     public static void main(String[] args) {
//         A a = new A();
//         B b = new B();
//         C c = new C();


//         a .start();
//         b .start();
//         c. start();
//     }
//  }
 

//set priority 
//  class A extends Thread
//  {
//     int i ;
//  public void run() {
//     System.out.println("thread  a start " );
//     for(i = 0 ; i < 10 ; i ++ )
//     {
//         System.out.println("from a thread A : " + i );
//     }
//     System.out.println(" thread a end here.. ");
//  }
//  }

//  class B extends A 
//  {
//     int j ;
//     public void run()
//     {
//         System.out.println(" thread  a start");
//         for ( j = 0 ; j < 10 ; j++)
//         {
//             System.out.println(" from a thread B : ");

//         }
//         System.out.println(" thread a end here...");
//     }
//  }
//  class C extends B
//  {
//     int k ;
//     public void run()
//     {
//         System.out.println(" thread  a start");
//         for ( k = 0 ; k < 10 ; k ++)
//         {
//             System.out.println(" from a thread C : ");

//         }
//         System.out.println(" thread a end here...");
//     }
//  }

//  class ThreadPriority 
//   {  
//     public static void main(String[] args) {
        
    
//    A aa = new A();
//    B bb = new B();
//    C cc = new C();
//    cc.setPriority(Thread.MAX_PRIORITY);
//    bb.setPriority(aa.getPriority()+1);
//    aa.setPriority(Thread.MIN_PRIORITY);
//    System.out.println("thread A start... : ");
//    aa.start();
//    System.out.println("thread B start... : ");
//    bb.start();
//    System.out.println("thread C start... : ");
//    cc.start();



   
//  }
//   }


// class A extends Thread {
//     public void run() {
//         for(int i = 0; i < 10; i++) {
//             System.out.println("Thread A : " + i);
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for(int j = 0; j < 10; j++) {
//             System.out.println("Thread B : " + j);
//         }
//     }
// }

// class C extends Thread {
//     public void run() {
//         for(int k = 0; k < 10; k++) {
//             System.out.println("Thread C : " + k);
//         }
//     }
// }

// class ThreadPriority {
//     public static void main(String[] args) {

//         A aa = new A();
//         B bb = new B();
//         C cc = new C();

//         aa.setPriority(Thread.MIN_PRIORITY);
//         bb.setPriority(Thread.NORM_PRIORITY);
//         cc.setPriority(Thread.MAX_PRIORITY);

//         aa.start();
//         bb.start();
//         cc.start();
//     }
// }

class A extends Thread
{
    public void run()
    {
        System.out.println(" \n inside Thread A :  \n Thread  ID : \t " + Thread.currentThread().getId()+"\n Thread Priority : \t" + Thread.currentThread().getPriority());
    }
}
class B extends Thread
{
    public void run()
    {
        System.out.println(" \n inside Thread B :  \n Thread  ID : \t " + Thread.currentThread().getId()+"\n Thread Priority : \t" + Thread.currentThread().getPriority());
    }
}
class C extends Thread
{
    public void run()
    {
        System.out.println(" \n inside Thread C :  \n Thread  ID : \t " + Thread.currentThread().getId()+"\n Thread Priority : \t" + Thread.currentThread().getPriority());
    }
}

class ThreadPriority
{
    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        C cc = new C();
        aa.setPriority(Thread.MIN_PRIORITY);
        bb.setPriority(Thread.NORM_PRIORITY);
        cc .setPriority(Thread.MAX_PRIORITY);
        System.out.println(" \n  inside  Main Thread and its ID is " + Thread.currentThread().getId()+"\n main thread Priority  = "+ Thread.currentThread().getPriority());
        System.out.println( " \n Now calling  other thread : Thread a -> b -> c ");
        aa.start();
        bb.start();
        cc.start();
    }
}