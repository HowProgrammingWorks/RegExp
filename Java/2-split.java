import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Example of using regular expressions for splitting strings.
 */
final class Split {
    /**
     * Private constructor prevents class from being instantiated.
     */
    private Split() {

    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments, not used
     */
    public static void main(final String[] args) {
        String input = "Hello World, here we are!";

        // Using String API
        String[] result1 = input.toLowerCase().split("\\W+");
        System.out.println(Arrays.toString(result1));

        // Using regex API
        Pattern pattern = Pattern.compile("\\W+");
        String[] result2 = pattern.split(input.toLowerCase());
        System.out.println(Arrays.toString(result2));
    }
}
