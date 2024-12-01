import java.util.ArrayList;
import java.util.Date;

public abstract class ReadingItem {

    String title;
    ArrayList<Author> author;
    String synopsis;
    Date datePublished;

    public ReadingItem(String title, ArrayList<Author> author, String synopsis, Date datePublished) {
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
        this.datePublished = datePublished;
    }

    // Getters 
    public String getTitle() {
        return title;
    }

    public ArrayList<Author> getAuthor() {
        return author;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public String getSynopsis() {
        return synopsis;
    }


    // Setters 
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthor(ArrayList<Author> newAuthor) {
        this.author = newAuthor;
    }

    public void setDatePublished(Date newDatePublished) {
        this.datePublished = newDatePublished;
    }

    public void setSynopsis(String updatedSynopsis) {
        this.synopsis = updatedSynopsis;
    }

    public abstract String getReadingItemInformation();

}
