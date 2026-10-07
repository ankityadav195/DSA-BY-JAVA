package OOP;

// public class Construction {
//     public static class Car{
//         int seats ;
//         String name;
//         double  length;
//          Car(){ //defualt construction

//          }


//     }
//     public static void main(String[] args) {
//         Car c1 = new Car();
//     }
    
// }
// public class Construction {
//     public static class Car{
//         int seats ;
//         String name;
//         double  length;
//          Car(int x ,String s ,double d){ 
//             seats = x;
//             name = s;
//             length = d;
//          }
//          void print(){
//             System.out.println(seats+" " +name+" "+ length+" ");
//          }
//          void print2(){
//           System.out.println(seats+" " +name+" "+ length+" ");


//          }


//     }

//     //method overloading
// public static int  max(int a ,int b){
//     return Math.max(a, b);
// }
// public static int  max(int a ,int b ,int c){
//     return Math.max(b, c);
// }
//     public static void main(String[] args) {
//        
//         System.out.println(max(3,4,5));



//     }
    
// }
public class Construction {
    public static class Car{
        int price ;
        String name;
        Car(){ // default value

        }
        
         Car(int x ,String s ){ 
            price = x;
            name = s;
     
         }
         void print(){
            System.out.println(price+" " +name+" ");
         }
         

    }

    //method overloading
    public static void main(String[] args) {
        Car c1 = new Car(4,"BMW M4");
         c1.print();
        Car c2= new Car(6,"BMW");
         c2.print();
         Car c3 = new Car();
         c3.name = "honda ";
      



    }
    
}
