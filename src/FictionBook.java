import java.util.ArrayList;
import java.util.Date;

public class FictionBook extends ReadingItem{

    private ArrayList<Genre> genre;
    
    public FictionBook(String title, ArrayList<Author> authors, String synopsis, Date datePublished, ArrayList<Genre> genre) {
        super(title, authors, synopsis, datePublished);
        this.genre = genre;
    }

    public ArrayList<Genre> getGenre() {
        return genre;
    }

    @Override
    public String getSpecificInformation() {
        String genreString = "Genre : " + this.genre.toString() + "\n";
        return genreString;
    }
}
