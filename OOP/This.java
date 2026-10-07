package OOP;

public class This {
    public static class Car{
        int price ;
        String name ;
        Car(int price,String name ){
            this .price = price;
            this.name = name ;
        }
        Car (String s ,int x ){
            this.price = x;
            name = s;
        }
         void print (){
            int price = 12; 
            System.out.println(price+" " + name);
         }
        
    }
    public static void main(String[] args) {
        Car c1 = new Car(1250000,"kia");
        c1.print();
        Car c2 = new Car("lord alto" , 4);
        c2.print();
    }
}
