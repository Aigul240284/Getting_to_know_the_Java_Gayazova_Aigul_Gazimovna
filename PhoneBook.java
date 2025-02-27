import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();

        Map<String, Set<String>> phoneBook = inputHandler.readPhoneBook();
        outputHandler.writePhoneBook(phoneBook);
        
    }
}

