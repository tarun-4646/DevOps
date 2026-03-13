
import java.util.*;

public class patterns{
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();


        // for (int i = 1; i <= n; i++){                      *****
        //     for(int j = 1; j <= n; j++){                   *****
        //         System.out.print("*");                     *****
        //        }                                           *****
        //     System.out.println();                          *****
        // }    


        // for (int i = 1; i <= n; i++){                      *
        //     for(int j = 1; j <= i; j++){                   **
        //         System.out.print("*");                     ***
        //     }                                              ****
        //     System.out.println();                          *****
        // }


        // for (int i = 1; i <= n; i++){                         1
        //     for(int j = 1; j <= i; j++){                      22
        //         System.out.print(i);                          333
        //     }                                                 4444
        //     System.out.println();                             55555
        // }


        // for (int i = 1; i <= n; i++){                         1   
        //     for(int j = 1; j <= i; j++){                      12
        //         System.out.print(j);                          123
        //     }                                                 1234
        //     System.out.println();                             12345
        // }

        // for (int i = n; i > 0; i--){                          *****
        //     for(int j = 1; j <= i; j++){                      ****
        //         System.out.print("*");                        ***
        //     }                                                 **
        //     System.out.println();                             *
        // }
                           
        

        // for (int i = n; i > 0; i--){                         12345
        //     for(int j = 1; j <= i; j++){                     1234
        //         System.out.print(j);                         123
        //     }                                                12
        //     System.out.println();                            1
        // }


        // for (int i = 1; i <= n; i++){                           *
        //     for(int j = 1; j <= n-i; j++){                     ***
        //         System.out.print(" ");                        *****                     
        //     }                                                *******
        //     for(int k = 1;k <= 2*i-1; k++){                 *********
        //         System.out.print("*");
        //     }                                            
        //     System.out.println();                          
        // }


        //         for (int i = n; i >= 1; i--){                           
        //     for(int j = 1; j <= n-i; j++){                  *********   
        //         System.out.print(" ");                       *******                      
        //     }                                                 *****
        //     for(int k = 1;k <= 2*i-1; k++){                    ***
        //         System.out.print("*");                          *
        //     }                                            
        //     System.out.println();                          
        // }



            //    for (int i = 1; i <= n; i++){                           
            // for(int j = 1; j <= n-i; j++){                     
            //     System.out.print(" ");                                             
            // }                                                
            // for(int k = 1;k <= 2*i-1; k++){                 
            //     System.out.print("*");
            // }                                                     *
            // System.out.println();                                ***
            // }                                                   *****
            //                                                    *******
            //                                                   ********* 
            //     for (int i = n; i >= 1; i--){                 *********          
            // for(int j = 1; j <= n-i; j++){                     *******
            //     System.out.print(" ");                          *****                    
            // }                                                    ***
            // for(int k = 1;k <= 2*i-1; k++){                       *
            //     System.out.print("*");                          
            // }                                            
            // System.out.println();  
            // }


            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){                   *
            //         System.out.print("*");                     **
            //     }                                              ***
            //     System.out.println();                          ****
            // }                                                  ***** 
            //     for(int i = n-1; i >= 1; i--){                 ****
            //         for(int j = 1; j <= i;j++){                ***
            //             System.out.print("*");                 **
            //         }                                          *
            //         System.out.println();
            //     }
            
            // int start;
            // for(int i = 1; i<= n; i++){
            //     if(i % 2 == 0){
            //         start = 0;                                 
            //     }                                              
            //     else{                                          1
            //         start = 1;                                 01
            //     }                                              101
            //     for(int j = 1; j <= i; j++){                   0101
            //         System.out.print(start);                   10101
            //         start = 1 - start;
            //     }
            //     System.out.println();
            // }  

            // char ch = 'A';
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){                   A
            //         System.out.print(ch);                      BB
                                                                  CCC
            //     }                                              DDDD
            //     ch++;                                          EEEEE
            //     System.out.println();
            // }


            
    }
}