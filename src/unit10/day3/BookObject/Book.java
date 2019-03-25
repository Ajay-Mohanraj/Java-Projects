package unit10.day3.BookObject;

public class Book {
    private static int numBooks = 0;

    public static final int ENGLISH = 0;
    public static final int SPANISH = 1;
    public static final int KOREAN = 2;
    public static final String[] LANGUAGES = {"English", "Spanish", "Korean"};

    private String title, author;
    private int language, numWords, numPages;

    public Book(String title, String author, int language){
        this.title = title;
        this.author = author;
        this.language = language;
    }
    public void setNumWords(int numWords){
        this.numWords = numWords;
    }
    public void setNumPages(int numPages){
        this.numPages = numPages;
    }
    public int getWordsPerPage(){
        return numWords / numPages;
    }
    public String toString(){
        return title + " written by " + author + " in " + LANGUAGES[language];
    }
}
