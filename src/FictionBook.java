import java.util.ArrayList;
import java.util.Date;

public class FictionBook extends ReadingItem{

    Genre genre;
    
    public FictionBook(String title, ArrayList<Author> author, String synopsis, Date datePublished, Genre genre) {
        super(title, author,synopsis, datePublished);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String getReadingItemInformation() {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'getReadingItemInformation'");
    }
}
