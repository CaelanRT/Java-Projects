import java.util.ArrayList;

public class Customer {
    //Instance Variables
    private String name;
    private String address;
    private int numBooksBorrowed = 0;
    //private ArrayList<Book> listBooksBorrowed = new ArrayList<Book>();

    //constructors
    public Customer() {

    }

    public Customer(String name, String address, int numBooksBorrowed, ArrayList<Book> listBooksBorrowed) {
        this.name = name;
        this.address = address;
        this.numBooksBorrowed = numBooksBorrowed;
       // this.listBooksBorrowed = listBooksBorrowed;
    }

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumBooksBorrowed() {
        return numBooksBorrowed;
    }

    public void setNumBooksBorrowed(int numBooksBorrowed) {
        this.numBooksBorrowed = numBooksBorrowed;
    }

    // public ArrayList<Book> getListBooksBorrowed() {
    //     return listBooksBorrowed;
    // }

    //haven't quite figured out how to add things to an array list that is private in this manner
    // public void addListBooksBorrowed() {

    // }

}
