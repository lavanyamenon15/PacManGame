import java.util.ArrayList;
import java.util.Date;

public class NonFictionBook extends ReadingItem{

    ArrayList<Topic> topic;

    public NonFictionBook(String title, ArrayList<Author> authors, String synopsis, Date datePublished, ArrayList<Topic> topic) {
        super(title, authors,synopsis, datePublished);
        this.topic = topic;
    }

    public ArrayList<Topic> getTopic() {
        return topic;
    }

    @Override
    public String getSpecificInformation() {
        String topicString = "Topic : " + getTopic() + "\n";
        return topicString;
    }
}
