import java.util.Scanner;

public class Input {

    /**
     * Reads an integer from the standard input
     * @param message (the message to display before reading)
     * @return the integer read
     */
    public static int readInt(String message) {
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);

            int input = scanner.nextInt();
            if (input < 0 || input > 2) {
                throw new NotValidCoordinatesException("The coordinates must be between 0 and 2!");
            }

            return input;
        } catch (NotValidCoordinatesException e) {
            System.out.println(e.getMessage());
            return readInt(message);
        }
    }

}
