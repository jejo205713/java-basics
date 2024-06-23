import java.util.Scanner;

public class TwoDArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) break;
            for (String element : line.split(" ")) {
                sum += Integer.parseInt(element);
            }
        }

        scanner.close();
        System.out.println("Sum of all elements in the 2D array: " + sum);
    }
}
