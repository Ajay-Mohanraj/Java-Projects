package unit10.day3.BookObject;

public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book("Tale of Two Cities", "Charles Dickens", Book.ENGLISH);
        b1.setNumPages(448);
        b1.setNumWords(135420);
        System.out.println(b1);
        System.out.println("Average words per page: " + b1.getWordsPerPage());
    }


}
