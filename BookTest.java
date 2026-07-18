public class BookTest {

    public static void main(String[] args) {

        Author author = new Author(
                "Chetan Bhagat",
                "chetan@gmail.com",
                'M');

        Book book = new Book(
                "Five Point Someone",
                author,
                499.50,
                25);

        System.out.println("Book Name : " + book.getName());
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Author Email : " + book.getAuthor().getEmail());
        System.out.println("Author Gender : " + book.getAuthor().getGender());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity In Stock : " + book.getQtyInStock());
    }
}