import java.util.Scanner;
    public class Lake{
         public static void main(String[] args) {
                
        Scanner scnr = new Scanner(System.in);

        int x;
        int y;
                         
        System.out.println("Enter a range of postive numbers: ");

        System.out.println("First Number: ");

        x = scnr.nextInt();

         System.out.println("Last Number: ");

        y = scnr.nextInt();
                         
        while(x > 0 && y > 0 && x < y){

            System.out.print("Zotexs numbers are: ");

                for(int i = x; i <= y; i++){
                                 
                    if(i % 3.5 == 0){
                                     
                        System.out.print(i + " ");
                                
                    }

                }
                                
                break;
                             
            }
                         
         if(x < 0 || y < 0 || y < x || x > y){

             System.out.println("Invalid Input");

         }

                         
    }
  }