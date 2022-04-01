class Student{
    String name;
    int age;

    // Student(){}

    // Student(String name,int age){
    //     this.name = name;
    //     this.age = age;

    // }

    // Student(Student S2){
    //     this.name =name;
    //     this.age = age;
    // }

    // public  void display(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // COMPILE TIME POLYMORPHISM OR WE CAN SAY THAT (METHOD OVERLOADING)
        
    // public void printInfo(String name){
    //     System.out.println(name);
    // }
    // //Here we use same name with different number of parameter is calleeed complieTime Poly
    // public void PrinterInfo(int age , String name){
    //     System.out.println(name + " "+age);
    // }

   
}




public class Opps {
    public static void main(String args[]){
        Student S1 = new Student();
        Student S2 = new Student(S1);

        S1.name ="Pranav";
        S1.age = 18;

        //  S2.Student("pranav ",18);
        S2.name = "Prana";
        S2.age = 20;
        S1.display();
        S2.display();


    }
    
}
