import Models.Systems;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static Models.ChooseService.chooseService;
import static Services.Allocate.allocate;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total Memory");
        Systems.setAvailableMemory(sc.nextInt());
        Systems.setUnavailableMemory(0);

        String s = "Yes";
        while (s.matches("Yes")) {

            String command;
            System.out.println("Enter the command");
            command = sc.nextLine();
            String[] commands = command.split(" ");
            chooseService(commands);

            System.out.println("Yes/No");
            s = sc.nextLine();

        }

    }
}
