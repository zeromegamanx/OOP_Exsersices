public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String isbn, String name, Author author, double price){
        this.qty = 0;
    }

    public Book(String isbn, String name, Author author, double price, int qty){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return author.getName();
    }

    public String getAuthorEmail(){
        return  author.getEmail();
    }

    public String toString(){
        StringBuilder description = new StringBuilder();
        description.append("Book [isbn = ")
                .append(this.isbn)
                .append(", name = ")
                .append(this.name)
                .append(", Author [name = ")
                .append(author.getName())
                .append(", email = ")
                .append(author.getEmail())
                .append("], price = ")
                .append(this.price)
                .append(", qty = ")
                .append(this.qty)
                .append("]");
        return description.toString();
    }
}
