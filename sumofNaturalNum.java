import java.util.*;


public class sumofNaturalNum {

    public static void main(String args[]) {

        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();


        // int result = num *(num + 1)/ 2;
        // System.out.println(result);
        
    //     int sum =0;
    //     for(int i=0;i<= num ;i++ ){
    //         sum += i;
    //     }
    //     System.out.println(sum);

    for(int i=1 ;i<=10;i++){
        System.out.println(num + "*" + i +"="+ num * i);
    }
    }
    
}
