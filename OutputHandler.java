import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class OutputHandler {
    public void writePhoneBook(Map<String, Set<String>> phoneBook) {
        List<Map.Entry<String, Set<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        System.out.println(sortedEntries.toString());
        sortedEntries.sort(Map.Entry.<String, Set<String>>comparingByValue(Comparator.comparingInt(Set::size)).reversed());

        System.out.println("\n Телефонная книга:");
        for (Map.Entry<String, Set<String>> entry : sortedEntries) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
    }
}
        


