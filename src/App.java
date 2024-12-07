import java.util.Scanner;

public class App {

    // EFFECTS: displays the welcome message for the user upon running the application
    static void displayWelcomeMessage(){
        String introMessage = "Welcome to Reading Log! \nThe perfect place to keep track of everything you read and what you think about it :)"; 
        System.out.println(introMessage);
    }

    // EFFECTS: displays the menu for the user and checks whether the input by the user is valid. Returns valid input.
    static int displayMenu(){
        String menu = "What would you like to do? \n" +
        "1. New entry \n" + 
        "2. View your reading log \n" + 
        "Please enter the number corresponding to the menu item you wish to choose"; 
        System.out.println(menu);

        Scanner menuInput = new Scanner(System.in);
        int wrongInput = 1;

        // this will keep looping until the user puts in a valid input (1 or 2) 
        while (wrongInput == 1) {

            try {
                int menuSelection = menuInput.nextInt();

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
                menuInput.nextLine(); // this clears the input stream so we don't enter an infinite loop
                wrongInput = 1;// loop again
            }
        }
        return 0;

    }


    public static void main(String[] args) throws Exception {

        displayWelcomeMessage();
        int menuSelection = displayMenu();
        

    }


}