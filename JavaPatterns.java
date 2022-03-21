import java.util.*;

public class JavaPatterns {

    public static void main(String args[]){

        /* 1)
        *****
        *****
        *****
        *****
        */


         int n=4;
         //int m =5;
        // for(int i =1;i<=n ;i++){
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


    /*2)
            *****
            *   *
            *   *
            *****
    */

        // for(int i=1 ;i<=n;i++){
        //     for(int j=1;j<=m ;j++){
        //         if( i == 1 || j == 1 || i == n || j== m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }

        //     }System.out.println();
        // }

    /*
    3)Half Pyramid - > here number of col equal to number rows so our col till increas until it becomes equal to row value
    *
    **
    ***
    ****
    */
    //int n =4;

    // for(int i=1;i<=n ;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }



    /*4) Inverted half pyramid
    ****
    ***
    **
    *
    
    
    
    */
    //     int counter = 0;
    // for(int i=1;i<=n ;i++){
    //         for(int j=1;j<=n-counter;j++){
    //             System.out.print("*");
    //         }
    //         counter++;
    //         System.out.println();
    //     }


    // for(int i=n;i<=1;i--){
    //     for(int j =1 ;j<= i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // for(int i=1 ;i<=n ;i++){
    //     for(int j = 1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    /*
    Number series
    1
    12
    123
    1234

    */
     // for(int i=n;i<=1;i--){
    //     for(int j =1 ;j<= i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // 
    
    /*Inverted Number Series

    1234
    123
    12
    1

        // */
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


            /*Flods Tringle
            1 
            2 3 
            4 5 6 
            7 8 9 10 
            */
            // int number =1;
            // for(int i=1;i<=n;i++){
            //         for(int j=1;j<=i;j++){
            //             System.out.print(number +" ");
            //             number++;
            //         }
            //         System.out.println();
            //     }

            /*9) 0,1 Tringle

                1
                01
                101
                0101
            */
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    int sum = i+j;

                    if( sum %2 == 0){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }

                }System.out.println();
            }
        
    }
    
}
