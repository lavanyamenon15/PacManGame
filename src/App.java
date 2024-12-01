import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);
    }
}