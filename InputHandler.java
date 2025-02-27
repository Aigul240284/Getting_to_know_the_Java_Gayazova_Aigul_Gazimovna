import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class InputHandler {
    public Map<String, Set<String>> readPhoneBook() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8); // Указание кодировки UTF-8
        Map<String, Set<String>> phoneBook = new HashMap<>();

        System.out.println("Введите данные в формате 'Имя Телефон' (для завершения введите 'end'):");

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }

            String[] parts = line.split("\\s+", 2); // Разделение на максимум 2 части
            if (parts.length != 2) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз.");
                continue;
            }

            String name = parts[0];
            String phone = parts[1];
            phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phone);
        }
        scanner.close();
        return phoneBook;
    }

}
