package OOP;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhau bhau");
        }
        
    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }

    }
    public static class Shar{
        void speak(){
            System.out.println(" grrrrrr");
        }


    }
    public static class Pikachu{
        void speak(){
            System.out.println("pika pika ");
        }


    }
    public static void main(String[] args) {
        Dog d  = new Dog();
        Cat c = new Cat();
        Shar s  = new Shar();
        Pikachu  p = new Pikachu();
        
        d.speak();
        c.speak();
        s.speak();
        p.speak();

        
    }
    
}
