import java.util.ArrayList;
import java.util.Date;

public class NonFictionBook extends ReadingItem{

    Topic topic;

    public NonFictionBook(String title, ArrayList<Author> authors, String synopsis, Date datePublished, Topic topic) {
        super(title, authors,synopsis, datePublished);
        this.topic = topic;
    }

    public Topic getTopic() {
        return topic;
    }

    @Override
    public String getSpecificInformation() {
        String topicString = "Date Published : " + getTopic() + "\n";
        return topicString;
    }
}
