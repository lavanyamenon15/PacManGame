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
        int wrongInput = 1;

        // this will keep looping until the user puts in a valid input (1 or 2) 
        while (wrongInput == 1) {

            try {
                int menuSelection = userInput.nextInt();

                if(menuSelection == 1 || menuSelection == 2){
                    System.out.println("New Entry");
                    return menuSelection;
                } else {
                    System.out.println("\n \n !! Try again: Please enter a number in the menu above !! \n \n");
                    System.out.println(menu);
                    wrongInput = 1; // loop again
                }

            } catch (Exception e) {
                System.out.println("\n \n !! Try again : Please enter a number !! \n \n");
                System.out.println(menu); 
                userInput.nextLine(); // this clears the input stream so we don't enter an infinite loop
                wrongInput = 1;// loop again
            }
        }
        return 0;

    }

    // EFFECT: prompts the user for the title of the item they have read
    static ReadingItem getTitle(){
        return null;
    }

    // EFFECT: prompts the user to enter the authors of the item they have read
    static ReadingItem getAuthors(){
        return null;
    }

    // EFFECT: prompts the user to enter the synopsis of the item they have read
    static ReadingItem getSynopsis(){
        return null;
    }

    // EFFECT: prompts the user to enter the date of the item they have read
    static ReadingItem getDatePublished(){
        return null;
    }

    // EFFECT: prompts the user to enter the genre of the item they have read
    static ReadingItem getGenre(){
        return null;
    }

    // EFFECT: prompts the user to enter the topic of the item they have read
    static ReadingItem getTopic(){
        return null;
    }

    // EFFECT: prompts the user to enter the DOI of the item they have read
    static ReadingItem getDOI(){
        return null;
    }


    // EFFECT: prompts the user to enter the journal of the item they have read
    static ReadingItem getJournal(){
        return null;
    }

    // EFFECT: prompts the user to enter the conference of the item they have read
    static ReadingItem getConference(){
        return null;
    }

    // EFFECT: prompts the user to enter the news platform of the item they have read
    static ReadingItem getNewsPlatform(){
        return null;
    }

    // EFFECT: prompts the user to enter the url of the item they have read
    static ReadingItem getURL(){
        return null;
    }

    // EFFECT: prompts the user to enter the article of the item they have read
    static ReadingItem getArticle(){
        return null;
    }

    // EFFECT: prompts the user to enter the paper of the item they have read
    static ReadingItem getPaper(){
        return null;
    }

    // EFFECT:  guides the user entering the details of the Non Fiction Book they are logging 
    static ReadingItem getNonFictionBook(){
        return null;
    }

    // EFFECT: guides the user entering the details of the Fictional Book they are logging 
    static ReadingItem getFictionBook(){


        return null;
    }

    // EFFECT: guides the user through selecting what reading item to created
    static ReadingItem getReadingItem(){

        String bookTypeMenu = "What type of book did you read? (please enter a number corresponding to an option below): \n" +
        "1. Fiction \n" +
        "2. Non Fiction \n";

        System.out.println(bookTypeMenu);

        int incorrectInput = 1;

        while (incorrectInput == 1) {
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

        return null;
    }

    // EFFECT: guides the user through creating a new reading log entry 
    static LogEntry newEntry(){
        return null;
    }

    // EFFECT: 
    static void viewLog(){

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

    }


}