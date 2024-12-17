public class Book {
    //instance variables
    private String title;
    private String author;
    private String description;
    private String publishDate;
    private boolean inStock;

    //Constructors
    public Book() {

    };

    public Book(String title, String author, String description, String publishDate, boolean inStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.publishDate = publishDate;
        this.inStock = inStock;
    };

    //Methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate){
        this.publishDate = publishDate;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock){
        this.inStock = inStock;
    }
    


}
