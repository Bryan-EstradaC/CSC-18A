//            Programmer Name : Bryan Estrada
//           Assignment Start : 3/6/2024 3:00 pm
//      Assignment Completion : 3/7/2024 5:10 pm
// Total Hours for Assignment : 4 hours
//                   Comments : Something that I like about this assignment is that the program can be perfectly used
//                              in a store and the customers can perfectly use this program to order the items that
//                              they want to buy. Something I would different is to print the balance every time the
//                              user chooses the item and the amount of the product wants to buy, instead of printing it
//                              only at the end of the program.

import java.util.Scanner;                  //Scanner class importation
import java.time.LocalDateTime;            //LocalDateTime class importation
import java.time.format.DateTimeFormatter; //Importation for class to format the date and time

public class CalculatingSales {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        float total = 0;        //Total balance
        int productNumber = 0;  //Variable to choose the product
        int quantitySold1, quantitySold2, quantitySold3, quantitySold4, quantitySold5;  //Amount of the product sold
        float price1 = 2.98f;   //Price of product 1
        float price2 = 4.50f;   //Price of product 2
        float price3 = 9.98f;   //Price of product 3
        float price4 = 4.49f;   //Price of product 4
        float price5 = 6.87f;   //Price of product 5

        //Welcoming message
        System.out.printf("%s%n%s%n%s%n", "Welcome to my store!", "Enter the product number you want to buy,",
                          "then the quantity you want to buy for that product");

        //Menu to choose the products and their amount sold
        while(productNumber != -1){         //Sentinel variable
            //Menu text
            System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n", "MENU (Enter -1 to exit)", "Product 1: $2.98",
                              "Product 2: $4.50", "Product 3: $9.98", "Product 4: $4.49", "Product 5: $6.87");
           productNumber = input.nextInt(); //Enter the user's choice
           switch(productNumber) {          //Switch statement
               case -1: System.out.println("Exiting...");   //Case where the sentinel is entered
                        break;
               case 1: System.out.print("Enter the quantity you want to buy for Product 1: ");  //Product 1 case
                       quantitySold1 = input.nextInt(); //Enter amount of the product sold
                       total += quantitySold1 * price1; //Update total
                       break;
               case 2: System.out.print("Enter the quantity you want to buy for Product 2: ");  //Product 2 case
                       quantitySold2 = input.nextInt(); //Enter amount of the product sold
                       total += quantitySold2 * price2; //Update total
                       break;
               case 3: System.out.print("Enter the quantity you want to buy for Product 3: ");  //Product 3 case
                       quantitySold3 = input.nextInt(); //Enter amount of the product sold
                       total += quantitySold3 * price3; //Update total
                       break;
               case 4: System.out.print("Enter the quantity you want to buy for Product 4: ");  //Product 4 case
                       quantitySold4 = input.nextInt(); //Enter amount of the product sold
                       total += quantitySold4 * price4; //Update total
                       break;
               case 5: System.out.print("Enter the quantity you want to buy for Product 5: ");  //Product 5 case
                       quantitySold5 = input.nextInt(); //Enter amount of the product sold
                       total += quantitySold5 * price5; //Update total
                       break;
               //Default case in case the user enters an invalid product number
               default: System.out.println("Enter numbers between 1 to 5 to choose the product you want to buy.");
           }
        }

        System.out.printf("\nYour total is: $%.2f%n", total);   //Print total balance

        //Goodbye message
        System.out.println("\nThank you for using the Calculating Sales application.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Time of calculation is ");
        System.out.println(dtf.format(now));

        System.exit(0); //Exit the program
    }
}