import java.util.ArrayList;
import java.util.Date;

public class Paper extends NonFictionBook{

    private String doi;
    private String journal;
    private String conference;


    public Paper(String title, ArrayList<Author> author, String synopsis, Date datePublished, Topic topic, String doi){
        super(title, author, synopsis, datePublished, topic);
    }

    public void setDOI(String doi) {
        this.doi = doi;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    @Override
    public String getReadingItemInformation() {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'getReadingItemInformation'");
    }

}
