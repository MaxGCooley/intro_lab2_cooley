import java.util.InputMismatchException;
import java.util.Scanner;
public class InputValidation {
    public static String username,password,phoneNumber;
    public static Scanner input = new Scanner(System.in);
    public static int IDNumber,choice;
    public static short amountPurchased;
    public static String [] choices = new String[] {"Chocolate Chip Cookie","Potato Chips","Gatorade",
                                                    "Chocolate Bar","Peanut Butter Sandwich", "Granola Bar",
                                                    "Bottled Water", "Soda Pop"};
    public static double [] price = new double[] {2.00, 1.50, 1.00, 1.35, 4.50, 0.75, 1.25};



    //-------------DO EDIT BETWEEN EXCEPT FOR DELETING COMMENTS------
    public static void main(String args[])
    {
        Menu();
        System.out.println("---------Welcome to the School Cafeteria!----------");
        System.out.print("Please enter your username: ");
        UsernameCheck();

        /* Uncomment for Part 2
        System.out.print("Please enter your password: ");
        PasswordCheck();
        */

        /* Uncomment for Part 3
        System.out.print("Please enter your 9 digit ID number: ");
        IDNumberCheck();
        */

        /* Uncomment for Part 4
        System.out.print("Please enter your phone number as XXX-XXX-XXXX : " );
        PhoneNumberCheck();
        */


        /* Uncomment for Part 5
        DisplayInfo();
        Menu();
        SelectionChoice();
        System.out.println("Your selection was : "+choice+") "+ choices[choice-1]);
        System.out.println("Each "+choices[choice-1]+" costs : $"+price[choice-1]);
        */

        /* Uncomment for Part 6
        System.out.println("");
        System.out.print("How many would you like to purchase: ");
        PurchaseChoice();

        System.out.println("You want to purchase : " +amountPurchased);
        System.out.println("");
        System.out.println("Your total will be: $"+amountPurchased*price[choice-1]);
        */
    }

    //-------DO EDIT BETWEEN EXCEPT FOR DELETING COMMENTS-------

    public static void UsernameCheck()
    {
    }

    public static void PasswordCheck()
    {
    }

    public static void IDNumberCheck()
    {
    }

    public static void PhoneNumberCheck()
    {
    }

    public static void SelectionChoice()
    {
    }

    public static void PurchaseChoice ()
    {
    }

    public static void DisplayInfo()
    {
        System.out.println("Your valid username is : " + username);
        System.out.println("Your valid password is : " + password);
        System.out.println("Your valid ID number is : "+IDNumber);
        System.out.println("Your valid PhoneNumber is : "+phoneNumber);

    }

    public static void Menu()
    {
        System.out.println("------Please make a selection!------");
        System.out.println("1) Chocolate Chip Cookie    5) Peanut Butter Sandwich");
        System.out.println("2) Potato Chips             6) Granola Bar");
        System.out.println("3) Gatorade	            7) Bottled Water");
        System.out.println("4) Chocolate Bar            8) Soda Pop");
        System.out.print("Selection: ");
    }
}
