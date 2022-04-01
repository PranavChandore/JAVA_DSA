
//Abstractio n declare with keyword called abstraction
abstract class Animal{
    abstract void walk();


    //Abstract claas s can have a constructor
    Animal(){
        System.out.println("Creating a new animal");
    }

    public void walking(){
        System.out.println("ANinmal are walking to try");
    }
 
}

class Horse extends Animal{

    Horse(){
        System.out.println("we creating an new horses");
    }
    public void walk(){
        System.out.println("Hores can walk in 4 legs");
    }
}

class chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walk in two legs");
    }
}


public class Abstraction {
    public static void main(String args[]){

        Horse H = new Horse();
        
        H.walk();

        chicken C = new chicken();
        C.walk();

    }   
}
