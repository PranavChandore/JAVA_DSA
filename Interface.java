 interface  Student{
    int eye =2 ;
   

}
interface college{
 
}


class StudentINfo implements Student,college{
    public void name(){
        System.out.println("ok");
     


    }
        
    }
    


public class Interface {
    public static void main(String args[]){

        StudentINfo S = new StudentINfo();

        S.name();



    }
    
}
