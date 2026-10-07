package OOP;

public class OPP {
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.seats=5;
        c.name= "kia";
        c.type = "suv";
        change(c);
        System.out.println(c.seats);
        c.print();
       

    }
    public static void change(Car c){
        c.seats = 4;

    }
    public static class Car{
        int seats;
        String name;
        double length;
        String type;


        void print(){
        System.out.println(seats+" "+ name+" "+ length+" "+ type +" ");
        }

    }
    
}
// object ko function me bhejta hu to vo (pass by refrence) hota hai


