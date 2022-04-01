class Shape{
    String color;

    public void Display(){
        System.out.println("shape of area");
    }
}

class Tringle extends Shape{
    public void area(int l,int h){
        System.out.println((1/2)*l*h);
    }
    

 
}

class EquiTringle extends Tringle
{
    public void area(int l,int h){
        System.out.println(l*h);
     
    }

}

class Circle extends Shape{
    public void area(int r){
     System.out.println( ((3.14)*r*r));
    }
}





public class Inheritance {



    public static void main(String args[]){
        Tringle T = new Tringle();
        T.area(20,30);
    
}
}