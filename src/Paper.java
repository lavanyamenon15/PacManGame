import java.util.ArrayList;
import java.util.Date;

public class Paper extends NonFictionBook{

    private String doi = "";
    private String journal = "";
    private String conference = "";


    public Paper(String title, ArrayList<Author> authors, String synopsis, Date datePublished, Topic topic, String doi){
        super(title, authors, synopsis, datePublished, topic);
    }

    public String getDOI() {
        return doi;
    }

    public String getJournal() {
        return journal;
    }

    public String getConference() {
        return conference;
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
    public String getSpecificInformation() {
        String doiString = "";
        String journalString = "";
        String conferenceString = ""; 

        String topicString = "Topic : " + getTopic() + "\n";

        if (this.doi == "") {
            doiString = "DOI: " + this.doi + "\n";
        } 

        if (this.conference == "") {
            conferenceString = "Conference: " + this.conference + "\n";
        }

        if (this.journal == "") {
            journalString = "Journal: " + this.journal + "\n";
        }

        return topicString + journalString + conferenceString + doiString;
    }

}
