package bank;

class Account{
    public String name;
    protected String email ;
    private String password;

    public String getPass(){
        return this.password;
    }
    public void setPass(String pass){
         this.password = pass;
    }
}
public class Bank {
    public static void main(String args[]){
        Account A = new Account();
        A.name = "Apna Colleage";
        A.email = "pranavchanodore2000@gmail.com";
        A.setPass("ABAc");
        System.out.println(A.getPass());
    }
    
}
