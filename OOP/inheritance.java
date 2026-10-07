package OOP;
class pokemon{
    int power;
    String type;
    pokemon(String type, int power){
        this.power = power;
        this.type = type; 

    }
    pokemon(){}
    void print (){
        System.out.println(this.power + " "+ this.type );
    }

}
class legend extends pokemon{ //child class
    String ability;

}
class strong extends pokemon{ //child class
    int speed;

}

public class inheritance {
    public static void main(String[] args) {
        legend n = new legend();
        n.ability = "pressure";
        // pokemon pikachu = new pokemon(null, 0);
       
    }

    
}
