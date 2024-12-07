import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class Article extends NonFictionBook{

    private String newsPlatform;
    private URL url;

    public Article(String title, ArrayList<Author> authors, String synopsis, Date datePublished, ArrayList<Topic> topic, String newsPlatform, URL url){
        super(title, authors, synopsis, datePublished, topic);
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
    public String getSpecificInformation() {
        String topicString = "Topic : " + getTopic() + "\n";
        String newsPlatformString = "News Platform: " + this.newsPlatform + "\n";
        String urlString = "URL: " + this.url.toString() + "\n";
        return topicString + newsPlatformString + urlString;
    }
}
