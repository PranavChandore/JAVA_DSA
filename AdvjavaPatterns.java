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
             ****
            ****
           ****
          ****

        */

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print (" ");
        //     }

        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*Number Pyramid question

                 1 
                2 2 
               3 3 3 
              4 4 4 4 
       
        */


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        /*Palindrome questions Pattern

             1
            212
           32123
          4321234
      

        */
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //             System.out.print(j);
        //     }

        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);


        //     }
        //     System.out.println();
        // }


        /*
        Dimond Pattern
           *
          ***
         *****
        *******
        *******
         *****
          ***
           *
        


        */

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }


        }
    }

