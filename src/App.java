import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {

    // We instantiate this as a global variable so we can use it in all helper 
    // functions and easily close it in the main() function after our programs 
    // is done running (we also don't need to keep passing the scanner as a 
    // parameter for each of our methods)
    static Scanner userInput = new Scanner(System.in); 

    // EFFECTS: displays the welcome message for the user upon running the application
    static void displayWelcomeMessage(){
        String introMessage = "\n************************************************************** \n" +
        "************************************************************** \n\n" +
        "Welcome to Reading Log! \nThe perfect place to keep track of everything you read and what you think about it :) \n"; 
        System.out.println(introMessage);
    }

    // EFFECTS: displays the menu for the user and checks whether the input by the user is valid. Returns valid input.
    static int displayMenu(){
        String menu = "What would you like to do? \n" +
        "1. New entry \n" + 
        "2. View your reading log \n" + 
        "Please enter the number corresponding to the menu item you wish to choose"; 
        System.out.println(menu);

        // this will keep looping until the user puts in a valid input (1 or 2) 
        while (true){
            try {
                int menuSelection = userInput.nextInt();

                if(menuSelection == 1 || menuSelection == 2){
                    System.out.println("New Entry");
                    return menuSelection;
                } else {
                    System.out.println("\n \n !! Try again: Please enter a number in the menu above !! \n \n");
                    System.out.println(menu);
                }

            } catch (Exception e) {
                System.out.println("\n \n !! Try again : Please enter a number !! \n \n");
                System.out.println(menu); 
                userInput.nextLine(); // this clears the input stream so we don't enter an infinite loop
            }
        }

    }

    // EFFECT: prompts the user for the title of the item they have read
    static String getTitle(String readingItemType){
        String getTitleString = "\nWhat is the title of the " + readingItemType + "? \n";
        System.out.println(getTitleString);
        int wrongInput = 1;

        while(wrongInput == 1){
            try {
                String titleInput = userInput.nextLine();
                return titleInput;
            } catch (Exception e) {
                continue;
            }
        }

        return null;
    }

    // EFFECT: prompts the user to enter the authors of the item they have read
    static ArrayList<Author> getAuthors(String readingItemType){
        String howManyAuthors = "How many authors are there for the " + readingItemType + "?";
        System.out.println(howManyAuthors);
        ArrayList<Author> authors = new ArrayList<>();
        int numAuthors;

        while(true){
            try {
                numAuthors = userInput.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\n\n !! Try again: Please enter a number !! \n\n");
                continue;
            }
        }

        while(true) {
            try {
                for(int i = 1; i <= numAuthors; i++) {
                    String i_thAuthorName = "What is the name of Author #" + i;
                    System.out.println(i_thAuthorName);
                    authors.add(new Author(i_thAuthorName));
                }
                return authors;
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the synopsis of the item they have read
    static String getSynopsis(String readingItemType){
        String getSynopsisString = "\nWhat is the synopsis of the " + readingItemType + "? \n";
        System.out.println(getSynopsisString);

        while(true){
            try {
                String synopsisInput = userInput.nextLine();
                return synopsisInput;
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the date the item they have read was published
    @SuppressWarnings("deprecation")
    static Date getDatePublished(String readingItemType){
        String getDateString = "\n What is the Date the " + readingItemType + " was published? (please enter your answer in YYYY-MM-DD format)\n";
        System.out.println(getDateString);

        while(true){
            try {
                String dateInput = userInput.nextLine();
                int year = Integer.parseInt(dateInput.substring(0,4));
                int month = Integer.parseInt(dateInput.substring(5,7));
                int day = Integer.parseInt(dateInput.substring(8));
                return new Date(year, month, day);
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the genre of the item they have read
    static ArrayList<Genre> getGenre(){
        String getGenreString = "\n What are the genres of the book?" + 
        "Please enter a list of numbers corresponding to the list below, separated by commas. (ex. 1,3,6,10) \n" +
        "1. Fantasy\n" + 
        "2. Historical Fiction\n" +
        "3. Literary_Fiction\n" +
        "4. Drama\n" +
        "5. Young_Adult\n" +
        "6. Classic\n" +
        "7. Romance\n" +
        "8. Thriller\n" +
        "9. Comedy\n" +
        "10. Poetry\n" +
        "11. Mystery\n" +
        "12. Science_Fiction";

        System.out.println(getGenreString);

        while(true){
            try {
                String genreInput = userInput.nextLine();
                String[] genreList = genreInput.split(",");
                ArrayList<Genre> genreListEnums = new ArrayList<>();
                for (String genre : genreList) {
                    genreListEnums.add(Genre.valueOf(genre));
                }
                return genreListEnums;
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the topic of the item they have read
    static ArrayList<Topic> getTopic(String readingItemType){
        String getTopicString = "\n What are the topics of the " + readingItemType + "?" +  
        "Please enter a list of numbers corresponding to the list below, separated by commas. (ex. 1,3,6,10) \n" +
        "1. Self_Help\n" + 
        "2. Technology\n" +
        "3. Philosophy\n" +
        "4. Religion\n" +
        "5. Politics\n" +
        "6. International_Relations\n" +
        "7. Computer_Science\n" +
        "8. LLMs\n" +
        "9. Algorithms\n" +
        "10. Machine_Learning\n" +
        "11. AI\n" +
        "12. Memoir\n" + 
        "13. Biography\n" +
        "14. Autobiography\n" +
        "15. Sports\n" +
        "16. Activism\n";

        System.out.println(getTopicString);

        while(true){
            try {
                String topicInput = userInput.nextLine();
                String[] topicList = topicInput.split(",");
                ArrayList<Topic> topicListEnums = new ArrayList<>();
                for (String topic : topicList) {
                    topicListEnums.add(Topic.valueOf(topic));
                }
                return topicListEnums;
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the DOI of the item they have read
    static String getDOI(){
        String getDOIString = "\nWhat is the doi of the paper? \n";
        System.out.println(getDOIString);

        while(true){
            try {
                String DOIInput = userInput.nextLine();
                return DOIInput;
            } catch (Exception e) {
                continue;
            }
        }
    }


    // EFFECT: prompts the user to enter the journal of the item they have read
    static String getJournal(){
        String getJournalString = "\nWhat is the journal that the paper was published in? (enter N/A if this does not apply)\n";
        System.out.println(getJournalString);

        while(true){
            try {
                String journalInput = userInput.nextLine();
                return journalInput;
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the conference of the item they have read
    static String getConference(){
        String getConferenceString = "\nWhat conference is associated with the paper? (enter N/A if this does not apply)\n";
        System.out.println(getConferenceString);

        while(true){
            try {
                String conferenceInput = userInput.nextLine();
                return conferenceInput;
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the news platform of the item they have read
    static String getNewsPlatform(){
        String getNewsPlatformString = "\nWhat news platform was this article published on? \n";
        System.out.println(getNewsPlatformString);

        while(true){
            try {
                String newsPlatformInput = userInput.nextLine();
                return newsPlatformInput;
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the url of the item they have read
    static URL getURL(){
        String getURL = "\nPlease enter the link for this article. \n";
        System.out.println(getURL);

        while(true){
            try {
                URL urlInput = new URL(userInput.nextLine());
                return urlInput;
            } catch (Exception e) {
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the article of the item they have read
    static ReadingItem getArticle(){
        // TODO
        return null;
    }

    // EFFECT: prompts the user to enter the paper of the item they have read
    static ReadingItem getPaper(){
        // TODO
        return null;
    }

    // EFFECT:  guides the user entering the details of the Non Fiction Book they are logging 
    static ReadingItem getNonFictionBook(){
        // TODO
        return null;
    }

    // EFFECT: guides the user entering the details of the Fictional Book they are logging 
    static ReadingItem getFictionBook(){
        // TODO
        return null;
    }

    // EFFECT: guides the user through selecting what reading item to created
    static ReadingItem getReadingItem(){

        String bookTypeMenu = "What type of book did you read? (please enter a number corresponding to an option below): \n" +
        "1. Fiction \n" +
        "2. Non Fiction \n";

        System.out.println(bookTypeMenu);

        while (true) {
            try {
                int readingItemSelection = userInput.nextInt();
                switch (readingItemSelection) {
                    case 1:
                        return getFictionBook();
                    case 2:
                        return getNonFictionBook();
                    default:
                        System.out.println("\n \n !! Try again: Please enter a number in the menu above !! \n \n");
                        System.out.println(bookTypeMenu);
                }
            } catch (Exception e) {
                userInput.nextLine(); // this clears the input stream so we don't enter an infinite loop
                System.out.println("\n \n !! Try again : Please enter a number !! \n \n");
                System.out.println(bookTypeMenu);
            }
        }
    }

    // EFFECT: guides the user through creating a new reading log entry 
    static LogEntry newEntry(){
        // TODO
        return null;
    }

    // EFFECT: 
    static void viewLog(){
        // TODO
    }


    public static void main(String[] args) throws Exception {

        displayWelcomeMessage();
        int menuSelection = displayMenu();
        switch (menuSelection) {
            case 1:
                getReadingItem();
                break;
            default:
                break;
        }

        // TODO - finish implementing

    }


}