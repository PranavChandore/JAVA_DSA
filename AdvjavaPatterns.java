public class AdvjavaPatterns {
    public static void main(String args[]){
        int n = 4;

        /*Butterfly Pattern
            *      *
            **    **
            ***  ***
            ********
            ***  ***
            **    **
            *      *
        */

        // for(int i=1;i<=n ;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     //Spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }

        //     //for 2nd half
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        //     }



        //     for(int i=n-1;i>=1 ;i--){
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
    
        //         //Spaces
        //         for(int j=1;j<=2*(n-i);j++){
        //             System.out.print(" ");
        //         }
    
        //         //for 2nd half
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
    
        //         System.out.println();
        //         }
            

        /*Rohmbus Pattern


        */

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

