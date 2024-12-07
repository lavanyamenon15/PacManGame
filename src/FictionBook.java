import java.util.ArrayList;
import java.util.Date;

public class FictionBook extends ReadingItem{

    private Genre genre;
    
    public FictionBook(String title, ArrayList<Author> authors, String synopsis, Date datePublished, Genre genre) {
        super(title, authors, synopsis, datePublished);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String getSpecificInformation() {
        String genreString = "Genre : " + this.genre.toString() + "\n";
        return genreString;
    }
}
