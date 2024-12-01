import java.util.ArrayList;
import java.util.Date;

public class NonFictionBook extends ReadingItem{

    Topic topic;

    public NonFictionBook(String title, ArrayList<Author> author, String synopsis, Date datePublished, Topic topic) {
        super(title, author,synopsis, datePublished);
        this.topic = topic;
    }

    public Topic getTopic() {
        return topic;
    }

    @Override
    public String getReadingItemInformation() {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'getReadingItemInformation'");
    }
}
