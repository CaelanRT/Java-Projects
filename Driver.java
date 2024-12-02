import java.util.Scanner;
import java.util.ArrayList;


public class Driver {
    public static void main(String[] args) {
        //declare variables and instantiate classes
        Scanner input = new Scanner(System.in);
        String userQuit = "N";
        int menuChoice = 0;

        System.out.println("Welcome to the Library\n");
        System.out.println("What is your name?\n");
        String userName = input.nextLine();
        Customer customer = new Customer();
        customer.setName(userName);


        while (!userQuit.equals("Y")) {
            String gettingName = customer.getName();

            System.out.printf("Hi %s, Please select from the following options:\n 1 - create a book\n 2 - take out a book\n 3 - return a book\n 4 - print a receipt", gettingName);
            
            if (input.hasNextInt()) {
                menuChoice = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Invalid input.\n");
                System.out.println("Please select from the following options:\n 1 - create a book\n 2 - take out a book\n 3 - return a book\n 4 - print a receipt");
            }
            

            //this is the main menu of the program
            switch (menuChoice) {
                case 1:
                    System.out.println("Creating a book:");
                    System.out.println("Title:");
                    String bookTitle = input.nextLine();
                    System.out.println("Author:");
                    String bookAuthor = input.nextLine();
                    System.out.println("Description:");
                    String bookDescription = input.nextLine();
                    System.out.println("Publish Date:");
                    String bookPublishDate = input.nextLine();
                    boolean bookInStock = true;

                    Book book1 = new Book(bookTitle, bookAuthor, bookDescription, bookPublishDate, bookInStock);
                    break;
                
                case 2:
                    System.out.println("Taking out a book:");
                    System.out.println("What book would you like to take out?");
                    String bookChoice = input.nextLine();
                    
                    //need to fix the block scope variables here
                    //String bookChoiceTitle = book1.getTitle();

                    break;

                case 3:
                    System.out.println("returning a book");
                    break;

                case 4:
                    System.out.println("printing a receipt");
                    break;
                default:
                    System.out.println("Not a valid input, input a number between 1 and 4.");
                    break;
            }

            System.out.println("Do you wish to quit? If so, type Y.");
            userQuit = input.nextLine().toUpperCase();
        }



        
    }
}
