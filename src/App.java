import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {

    // We instantiate this as a global variable so we can use it in all helper 
    // functions and easily close it in the main() function after our programs 
    // is done running (we also don't need to keep passing the scanner as a 
    // parameter for each of our methods)
    static Scanner userInput = new Scanner(System.in); 

    static void displaySeparator(){
        System.out.println("\n************************************************************** \n" +
        "************************************************************** \n");
    }

    // EFFECTS: displays the welcome message for the user upon running the application
    static void displayWelcomeMessage(){
        displaySeparator();
        String introMessage = "Welcome to Reading Log! \nThe perfect place to keep track of everything you read and what you think about it :) \n"; 
        System.out.println(introMessage);
    }

    // EFFECTS: displays the menu for the user and checks whether the input by the user is valid. Returns valid input.
    static int displayMenu(){
        String menu = "* What would you like to do? \n" +
        "* 1. New entry \n" + 
        "* 2. View your reading log \n" + 
        "* Please enter the number corresponding to the menu item you wish to choose \n"; 
        System.out.println(menu);

        // this will keep looping until the user puts in a valid input (1 or 2) 
        while (true){
            try {
                int menuSelection = userInput.nextInt();
                userInput.nextLine();

                if(menuSelection == 1 || menuSelection == 2){
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
        String getTitleString = "\n* What is the title of the " + readingItemType + "? \n" ;
        System.out.println(getTitleString);

        while(true){
            try {
                String titleInput = userInput.nextLine();
                return titleInput;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the authors of the item they have read
    static ArrayList<Author> getAuthors(String readingItemType){
        String howManyAuthors = "\n* How many authors are there for the " + readingItemType + "? \n";
        System.out.println(howManyAuthors);
        ArrayList<Author> authors = new ArrayList<>();
        int numAuthors;

        while(true){
            try {
                numAuthors = Integer.parseInt(userInput.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("\n\n !! Try again: Please enter a number !! \n\n");
                continue;
            }
        }

        while(true) {
            try {
                for(int i = 1; i <= numAuthors; i++) {
                    System.out.println("\n* What is the name of Author #" + i + "\n");
                    String i_thAuthorName = userInput.nextLine();
                    authors.add(new Author(i_thAuthorName));
                }
                return authors;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the synopsis of the item they have read
    static String getSynopsis(String readingItemType){
        String getSynopsisString = "\n* What is the synopsis of the " + readingItemType + "? \n";
        System.out.println(getSynopsisString);

        while(true){
            try {
                String synopsisInput = userInput.nextLine();
                return synopsisInput;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the date the item they have read was published
    static Date getDatePublished(String readingItemType){
        String getDateString = "\n* What is the Date the " + readingItemType + " was published? (please enter your answer in YYYY-MM-DD format) \n";
        System.out.println(getDateString);

        while(true){
            try {
                String dateInput = userInput.nextLine();
                // int year = Integer.parseInt(dateInput.substring(0,4));
                // int month = Integer.parseInt(dateInput.substring(5,7));
                // int day = Integer.parseInt(dateInput.substring(8));
                // userInput.nextLine();
                // GregorianCalendar(year + 1900, month, day)

                return new SimpleDateFormat("yyyy-MM-dd").parse(dateInput);
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the genre of the item they have read
    static ArrayList<Genre> getGenre(){
        String getGenreString = "\n* What are the genres of the book? \n" + 
        "* Please enter a list of numbers corresponding to the list below, separated by commas. (ex. 1,3,6,10) \n" +
        "* 1. Fantasy\n" + 
        "* 2. Historical Fiction\n" +
        "* 3. Literary Fiction\n" +
        "* 4. Drama\n" +
        "* 5. Young Adult\n" +
        "* 6. Classic\n" +
        "* 7. Romance\n" +
        "* 8. Thriller\n" +
        "* 9. Comedy\n" +
        "* 10. Poetry\n" +
        "* 11. Mystery\n" +
        "* 12. Science Fiction \n";

        System.out.println(getGenreString);

        while(true){
            try {
                String genreInput = userInput.nextLine();
                String[] genreList = genreInput.split("[,]");
                ArrayList<Genre> genreListEnums = new ArrayList<>();
                for (String genre : genreList) {
                    switch (genre) {
                        case "1":
                            genreListEnums.add(Genre.Fantasy);
                            break;
                        case "2":
                            genreListEnums.add(Genre.Historical_Fiction);
                            break;
                        case "3":
                            genreListEnums.add(Genre.Literary_Fiction);
                            break;
                        case "4":
                            genreListEnums.add(Genre.Drama);
                            break;
                        case "5":
                            genreListEnums.add(Genre.Young_Adult);
                            break;
                        case "6":
                            genreListEnums.add(Genre.Classic);
                            break;
                        case "7":
                            genreListEnums.add(Genre.Romance);
                            break;
                        case "8":
                            genreListEnums.add(Genre.Thriller);
                            break;
                        case "9":
                            genreListEnums.add(Genre.Comedy);
                            break;
                        case "10":
                            genreListEnums.add(Genre.Poetry);
                            break;
                        case "11":
                            genreListEnums.add(Genre.Mystery);
                            break;
                        case "12":
                            genreListEnums.add(Genre.Science_Fiction);
                            break;
                        default:
                            break;
                    }
                }
                return genreListEnums;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the topic of the item they have read
    static ArrayList<Topic> getTopic(String readingItemType){
        String getTopicString = "\n* What are the topics of the " + readingItemType + "? \n" +  
        "* Please enter a list of numbers corresponding to the list below, separated by commas. (ex. 1,3,6,10) \n" +
        "* 1. Self Help\n" + 
        "* 2. Technology\n" +
        "* 3. Philosophy\n" +
        "* 4. Religion\n" +
        "* 5. Politics\n" +
        "* 6. International Relations\n" +
        "* 7. Computer Science\n" +
        "* 8. LLMs\n" +
        "* 9. Algorithms\n" +
        "* 10. Machine Learning\n" +
        "* 11. AI\n" +
        "* 12. Memoir\n" + 
        "* 13. Biography\n" +
        "* 14. Autobiography\n" +
        "* 15. Sports\n" +
        "* 16. Activism \n";

        System.out.println(getTopicString);

        while(true){
            try {
                String topicInput = userInput.nextLine();
                String[] topicList = topicInput.split("[,]");
                ArrayList<Topic> topicListEnums = new ArrayList<>();
                for (String topic : topicList) {
                        switch (topic) {
                            case "1":
                                topicListEnums.add(Topic.Self_Help);
                                break;
                            case "2":
                                topicListEnums.add(Topic.Technology);
                                break;
                            case "3":
                                topicListEnums.add(Topic.Philosophy);
                                break;
                            case "4":
                                topicListEnums.add(Topic.Religion);
                                break;
                            case "5":
                                topicListEnums.add(Topic.Politics);
                                break;
                            case "6":
                                topicListEnums.add(Topic.International_Relations);
                                break;
                            case "7":
                                topicListEnums.add(Topic.Computer_Science);
                                break;
                            case "8":
                                topicListEnums.add(Topic.LLMs);
                                break;
                            case "9":
                                topicListEnums.add(Topic.Algorithms);
                                break;
                            case "10":
                                topicListEnums.add(Topic.Machine_Learning);
                                break;
                            case "11":
                                topicListEnums.add(Topic.AI);
                                break;
                            case "12":
                                topicListEnums.add(Topic.Memoir);
                                break;
                            case "13":
                                topicListEnums.add(Topic.Biography);
                                break;
                            case "14":
                                topicListEnums.add(Topic.Autobiography);
                                break;
                            case "15":
                                topicListEnums.add(Topic.Sports);
                                break;
                            case "16":
                                topicListEnums.add(Topic.Activism);
                                break;
                            default:
                                break;
                    }
                }
                return topicListEnums;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the DOI of the item they have read
    static String getDOI(){
        String getDOIString = "\n* What is the doi of the paper?\n";
        System.out.println(getDOIString);

        while(true){
            try {
                String DOIInput = userInput.nextLine();
                return DOIInput;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }


    // EFFECT: prompts the user to enter the journal of the item they have read
    static String getJournal(){
        String getJournalString = "\n* What is the journal that the paper was published in?\n";
        System.out.println(getJournalString);

        while(true){
            try {
                String journalInput = userInput.nextLine();
                return journalInput;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the conference of the item they have read
    static String getConference(){
        String getConferenceString = "\n* What conference is associated with the paper?\n";
        System.out.println(getConferenceString);

        while(true){
            try {
                String conferenceInput = userInput.nextLine();
                return conferenceInput;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the news platform of the item they have read
    static String getNewsPlatform(){
        String getNewsPlatformString = "\n* What news platform was this article published on? \n";
        System.out.println(getNewsPlatformString);

        while(true){
            try {
                String newsPlatformInput = userInput.nextLine();
                userInput.nextLine();
                return newsPlatformInput;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the url of the item they have read
    static URL getURL(){
        String getURL = "\n* Please enter the link for this article. \n";
        System.out.println(getURL);

        while(true){
            try {
                URL urlInput = new URL(userInput.nextLine());
                userInput.nextLine();
                return urlInput;
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECTS: checks if the given reading items has the given attribute 
    static Boolean hasAttribute(String attributeName, String readingItemType){
        System.out.println("\n* Is there a " + attributeName + " associated with this " + readingItemType + "? (Answer with Y or N) \n");

        while(true){
            try {
                String hasAttribute = userInput.nextLine();
                if(hasAttribute.equals("Y")){
                    return true;
                } else if (hasAttribute.equals("N")) {
                    return false;
                } else {
                    System.out.println("\n\n !! Try again: Please answer with Y or N !! \n\n");
                    userInput.nextLine();
                }
            } catch (Exception e) {
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: prompts the user to enter the article of the item they have read
    static Article getArticleAttributes(Article article){
        String newsPlatform = getNewsPlatform();
        URL url = getURL();
        article.setNewsPlatform(newsPlatform);
        article.setURL(url);

        return article;
    }

    // EFFECT: prompts the user to enter the paper details of the item they have read
    static Paper getPaperAttributes(Paper paper){
        String doi = getDOI();
        String journal; 
        String conference;
        paper.setDOI(doi);

        if (hasAttribute("conference", "paper")){
            conference = getConference();
            paper.setConference(conference);
        }

        if (hasAttribute("journal", "paper")){
            journal = getJournal();
            paper.setJournal(journal);
        }

        return paper;
    }

    // EFFECT: prompts the user to select the type of nonfiction reading item they want to log 
    static String getTypeOfNonFiction() {
        String typeOfNonFiction = "\n* What type of non fiction reading item would you like to log? (please enter a number corresponding to an option below)\n" +
        "* 1. Non Fiction Book\n"+
        "* 2. Academic Paper\n" +
        "* 3. Article\n";
        System.out.println(typeOfNonFiction);

        while(true){
            try {
                int typeOfNonfiction = userInput.nextInt();
                userInput.nextLine();
                switch (typeOfNonfiction) {
                    case 1:
                        return "book";
                    case 2:
                        return "paper";
                    case 3:
                        return "article";
                    default:
                        System.out.println("\n\n !! Try again: Please enter a number listed above !! \n\n");
                        System.out.println(typeOfNonFiction);
                }
            } catch (Exception e) {
                System.out.println("\n\n !! Try again: Please enter a number !! \n\n");
                System.out.println(typeOfNonFiction);
                userInput.nextLine();
                continue;
            }
        }
    }

    // EFFECT: guides the user entering the details of the Non Fiction Book they are logging 
    static ReadingItem getNonFictionBook(){
        String readingItemType = getTypeOfNonFiction();
        String title = getTitle(readingItemType);
        ArrayList<Author> authors = getAuthors(readingItemType);
        String synopsis = getSynopsis(readingItemType);
        Date datePublished = getDatePublished(readingItemType);
        ArrayList<Topic> topic = getTopic(readingItemType);

        if(readingItemType == "paper"){
            Paper paper = new Paper(title, authors, synopsis, datePublished, topic);
            paper = getPaperAttributes(paper);
            return paper;
        } else if (readingItemType == "article") {
            Article article = new Article(title, authors, synopsis, datePublished, topic);
            article = getArticleAttributes(article);
            return article;
        } else {
            return new NonFictionBook(title, authors, synopsis, datePublished, topic);
        }
    }

    // EFFECT: guides the user entering the details of the Fictional Book they are logging 
    static ReadingItem getFictionBook(){
        String readingItemType = "book";
        String title = getTitle(readingItemType);
        ArrayList<Author> authors = getAuthors(readingItemType);
        String synopsis = getSynopsis(readingItemType);
        Date datePublished = getDatePublished(readingItemType);
        ArrayList<Genre> genre = getGenre();

        return new FictionBook(title, authors, synopsis, datePublished, genre);
    }

    // EFFECT: guides the user through selecting what reading item to created
    static ReadingItem getReadingItem(){

        String bookTypeMenu = "\n* What type of book did you read? (please enter a number corresponding to an option below): \n" +
        "* 1. Fiction \n" +
        "* 2. Non Fiction \n";

        System.out.println(bookTypeMenu);

        while (true) {
            try {
                int readingItemSelection = userInput.nextInt();
                userInput.nextLine();
                switch (readingItemSelection) {
                    case 1:
                        displaySeparator();
                        return getFictionBook();
                    case 2:
                        displaySeparator();
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
                System.out.println(getReadingItem().getReadingItemInformation());
                break;
            default:
                break;
        }

        // TODO - finish implementing

    }


}