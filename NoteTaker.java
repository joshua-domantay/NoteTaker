package NoteTaker;

import java.util.Scanner;

public class NoteTaker {
    public static void main(String[] args) {
        Scanner _input = new Scanner(System.in);
        boolean _running = true;

        while(_running) {
            printHeader();
            printMenuPrompt();

            int _choice = _input.nextInt();
            switch(_choice) {
                case 1:
                    createNewFile();
                    break;
                case 2:
                    openSavedFile();
                    break;
                case 3:
                    _running = false;
                    break;
                default:
                    break;
            }
            if((_choice == 1) || (_choice == 2)) { clearScreen(); }
        }
    }

    private static void printHeader() { System.out.println("================ Note Taker ================"); }

    private static void printMenuPrompt() {
        System.out.println("1.) Create new file");
        System.out.println("2.) Open saved file");
        System.out.println("3.) Exit program");
        System.out.print("\t> ");
    }

    private static void createNewFile() {       // Possibly return File later
        // Create new file
    }

    private static void openSavedFile() {       // Possibly return File later
        // Open saved file
    }

    private static void clearScreen() {     // throws IOException, InterruptedException
        // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        for(int i = 0; i < 50; i++) { System.out.println(); }
    }
}
