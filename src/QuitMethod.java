import org.openqa.selenium.WebDriver;
import java.util.Scanner;

public class QuitMethod {

    public static void goQuit(WebDriver driver) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type \"quit\" to quit the Process!");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("quit"))
        {
            driver.close();
            driver.quit();
            System.out.println("Quit finished!");
        }
    }
}
