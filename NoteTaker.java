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
                    modifyNotes(_input, null);
                    break;
                case 2:
                    NoteTakerList _saved = openSavedNotes();
                    modifyNotes(_input, _saved);
                    break;
                case 3:
                    _running = false;
                    break;
                default:
                    break;
            }
            if(_running) { clearScreen(); }
        }

        _input.close();
    }

    private static void printHeader() { System.out.println("================ Note Taker ================"); }

    private static void printMenuPrompt() {
        System.out.println("1.) Create new notes");
        System.out.println("2.) Open saved notes");
        System.out.println("3.) Exit program");
        System.out.print("\t> ");
    }

    private static void printModifyPrompt() {
        System.out.println("1.) Add note");
        System.out.println("2.) Print all notes");
        System.out.println("3.) Return to main menu");
        System.out.print("\t> ");
    }

    private static void modifyNotes(Scanner _input, NoteTakerList _notes) {
        if(_notes == null) { _notes = new NoteTakerList(); }

        // Prompt if notes are arranged alphabetically
        clearScreen();
        printHeader();
        System.out.print("Organize notes alphabetically (1 = yes)?\n\t> ");
        if(_input.nextInt() == 1) { _notes.setOrganize(true); }

        boolean _running = true;
        while(_running) {
            clearScreen();
            printHeader();
            printModifyPrompt();

            int _choice = _input.nextInt();
            switch(_choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    _running = false;
                    break;
                default:
                    break;
            }
            if(_running) { clearScreen(); }
        }
    }

    private static NoteTakerList openSavedNotes() {
        return null;
    }

    private static void clearScreen() {     // throws IOException, InterruptedException
        // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        for(int i = 0; i < 50; i++) { System.out.println(); }
    }
}
