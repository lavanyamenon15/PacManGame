import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class Article extends NonFictionBook{

    private String newsPlatform;
    private URL url;

    public Article(String title, ArrayList<Author> author, String synopsis, Date datePublished, Topic topic, String newsPlatform, URL url){
        super(title, author, synopsis, datePublished, topic);
        this.newsPlatform = newsPlatform;
        this.url = url;
    }

    public String getNewsPlatform() {
        return newsPlatform;
    }

    public URL getURL() {
        return url;
    }

    @Override
    public String getReadingItemInformation() {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'getReadingItemInformation'");
    }
}
