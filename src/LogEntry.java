import java.util.Date;

public class LogEntry {

    private Date dateOfEntry;
    private ReadingItem readingItem;
    private Float rating;
    private String review; 

    public LogEntry(Date dateOfEntry, ReadingItem readingItem, Float rating, String review){
        this.dateOfEntry = dateOfEntry;
        this.readingItem = readingItem;
        this.rating = rating;
        this.review = review;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public Float getRating() {
        return rating;
    }

    public ReadingItem getReadingItem() {
        return readingItem;
    }

    public String getReview() {
        return review;
    }

    public void setDateOfEntry(Date date) {
        this.dateOfEntry = date;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public void setReadingItem(ReadingItem item) {
        this.readingItem = item;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
