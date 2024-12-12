import java.util.Scanner;
import java.util.ArrayList;


public class Driver {
    public static void main(String[] args) {
        //declare variables and instantiate classes
        Scanner input = new Scanner(System.in);
        String userQuit = "N";
        int menuChoice = 0;
        ArrayList<Book> books = new ArrayList<Book>();
        //declare an ArrayList of books and add your book when its created to this list, itll keep through the scope

        System.out.println("Welcome to the Library");
        System.out.println("What is your name?");
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
                    books.add(book1);
                    System.out.printf("Your book %s was written by %s. It is about %s and was published %s. \n", bookTitle, bookAuthor, bookDescription, bookPublishDate);
                    break;

                //this case takes out a book
                case 2:
                    System.out.println("Taking out a book:");
                    System.out.println("What book would you like to take out?");
                    String bookChoice = input.nextLine();

                    //this iterates over the array list and compares the users input to find valid books in the list and to see if they are in stock
                    for (int i = 0; i < books.size(); ++i) {
                        String listBookTitle = (books.get(i)).getTitle();
                        if (bookChoice.equals(listBookTitle) && (books.get(i).getInStock()) == true) {
                            System.out.printf("You wanted %s, that book is in stock.\n", listBookTitle);
                            customer.addListBooksBorrowed(books.get(i));
                            books.get(i).setInStock(false);
                            System.out.printf("You now have %s on loan.\n", listBookTitle);
                            customer.setNumBooksBorrowed();
                        } else if (bookChoice.equals(listBookTitle) && (books.get(i).getInStock()) == false){
                            System.out.printf("You wanted %s, that book is not in stock.\n", listBookTitle);
                        } else {
                            System.out.println("That is not a valid title in our library.");
                        }
                    }

                    break;

                case 3:
                    System.out.println("Returning a book");
                    System.out.println("What book would you like to return?");
                    String bookReturnChoice = input.nextLine();

                    for (int i = 0; i < customer.getListBooksBorrowed().size(); ++i) {
                        String returnBookTitle = ((customer.getListBooksBorrowed()).get(i).getTitle());
                        if (bookReturnChoice.equals(returnBookTitle)) {
                            System.out.printf("You wanted to return %s. We have added it back to our shelves.\n", bookReturnChoice);
                            customer.getListBooksBorrowed().remove(i);
                            customer.setNumBooksBorrowed();
                            for (int j = 0; j < books.size(); ++j) {
                                String returnBookListTitle = (books.get(i)).getTitle();
                                if (bookReturnChoice.equals(returnBookListTitle)) {
                                    books.get(i).setInStock(true);
                                }
                            }
                            
                        }
                    }
                    break;

                case 4:
                    System.out.println("Printing a receipt");
                    System.out.printf("Name: %s\n", customer.getName());
                    System.out.printf("Number of books borrowed: %d\n", customer.getNumBooksBorrowed());
                    System.out.println("List of books borrowed:");
                    for (int i = 0; i < customer.getListBooksBorrowed().size(); ++i) {
                        System.out.println("- " + customer.getListBooksBorrowed().get(i).getTitle());
                    }
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
