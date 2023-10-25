import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateWithMonthAsString {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define a custom date format with the month as a string
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");

        // Format the current date using the custom format
        String formattedDate = currentDate.format(customFormatter);

        System.out.println("Today's Date: " + formattedDate);
    }
}