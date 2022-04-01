import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];//Declratio of an array return_type array_name[] = new int[size]
        
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();//Take input form user
        }
        int key;
        key = sc.nextInt();

        for(int i=0;i<n;i++){
            if(marks[i] == key){
                System.out.println(i);
            }
        }
           

    }
    
}
