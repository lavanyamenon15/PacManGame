import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class Article extends NonFictionBook{

    private String newsPlatform;
    private URL url;

    public Article(String title, ArrayList<Author> authors, String synopsis, Date datePublished, ArrayList<Topic> topic){
        super(title, authors, synopsis, datePublished, topic);
    }

    public String getNewsPlatform() {
        return newsPlatform;
    }

    public URL getURL() {
        return url;
    }

    public void setNewsPlatform(String newsPlatform) {
        this.newsPlatform = newsPlatform;
    }

    public void setURL(URL url) {
        this.url = url;
    }

    @Override
    public String getSpecificInformation() {
        String topicString = "Topic : " + getTopic() + "\n";
        String newsPlatformString = "News Platform: " + this.newsPlatform + "\n";
        String urlString = "URL: " + this.url.toString() + "\n";
        return topicString + newsPlatformString + urlString;
    }
}
