public class BookTest {
    public static void main(String[] args) {
        Author author1 = new Author("Tan", "tan.com");
        System.out.println(author1);

        author1.setEmail("tan.vn");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());

        Book book1 = new Book("12345", "Java for Dummies", author1, 8.8, 88);
        System.out.println(book1);

        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is: " + book1.getIsbn());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());
        System.out.println("Author is: " + book1.getAuthor());

        System.out.println("author's name is: " + book1.getAuthorName());
        System.out.println("author's email is: " + book1.getAuthorEmail());
    }
}
