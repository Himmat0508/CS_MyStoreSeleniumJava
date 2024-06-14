package pyramid_pattern;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		System.out.println("How many rows you want in this pattern?");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         
        for (int i = 1; i <= rows; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = 5; j >= i; j--) 
            { 
                System.out.print(j+" "); 
            } 
             
            System.out.println(); 
        }
	}

}
