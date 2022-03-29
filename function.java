import java.util.*;

public class function{

    public static int mulBro(int a , int b){
        int mul = a*b;
        return mul;
    }

    // 
    
    // public static int factNUm(int n){
    //     if(n == 0){
    //         return 1;
    //     }
        
    //     return n*factNUm(n-1);
    // }


    // public static int fabSeries(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }

    //     return fabSeries(n-1) + fabSeries(n-2);
    // }

    public static int powerOFnum(int n,int p){
        if(p == 0){
            return 1;
        }

        return n*powerOFnum(n,p-1);
    }
    public  static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int b = sc.nextInt();

        int sum = mulBro(n,b);
        System.out.println(sum);


        
    }
    
    }
