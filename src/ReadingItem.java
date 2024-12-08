import java.util.ArrayList;
import java.util.Date;

public abstract class ReadingItem {

    private String title;
    private ArrayList<Author> authors;
    private String synopsis;
    private Date datePublished;

    public ReadingItem(String title, ArrayList<Author> authors, String synopsis, Date datePublished) {
        this.title = title;
        this.authors = authors;
        this.synopsis = synopsis;
        this.datePublished = datePublished;
    }

    // Getters 
    public String getTitle() {
        return title;
    }

    public ArrayList<Author> getAuthor() {
        return authors;
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
        this.authors = newAuthor;
    }

    public void setDatePublished(Date newDatePublished) {
        this.datePublished = newDatePublished;
    }

    public void setSynopsis(String updatedSynopsis) {
        this.synopsis = updatedSynopsis;
    }

    public String  getAuthorsNames() {
        String names = "";
        for (int i = 0; i < authors.size(); i++) {
            if(i == 0) {
                names += authors.get(i).getName();
            } else {
                names += ", " + authors.get(i).getName();
            }
        }
        return names;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public String getReadingItemInformation() {
        String titleString = "Book Title : " + getTitle() + "\n";
        String authorString = "Author(s) : " + getAuthorsNames() + "\n";
        String synopsisString = "Synopsis : " + getSynopsis();
        String datePublishedString = "Date Published : " + getDatePublished().toString() + "\n";
        String specificInformation = getSpecificInformation();

        return titleString + authorString + datePublishedString + specificInformation + synopsisString;
    }

    public abstract String getSpecificInformation();

}
