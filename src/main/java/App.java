import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.Scanner;

@Command(name = "java-cli", mixinStandardHelpOptions = true, version = "1.0",
        description = "CLI Application with Picocli")

public class App implements Runnable {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("Menu:");
            System.out.println("1. Logon na OCP");
            System.out.println("2. Quit");
            System.out.print("Izbor: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    sendHttpRequest();
                    break;
                case "2":
                    running = false;
                    break;
                default:
                    System.out.println("Krivi odabir");
            }
        }
    }

    private void sendHttpRequest() {

        System.out.println("Sending HTTP request i response za Logon...");
    }

    public static void main(String[] args) {

        CommandLine.run(new App(), args);

    }
}
