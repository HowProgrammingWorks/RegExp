import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Example of using regular expressions for finding strings.
 */
final class Match {
    /**
     * Private constructor prevents class from being instantiated.
     */
    private Match() {

    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments, not used
     */
    public static void main(final String[] args) {
        String[] inputs = {"My email is someones@mail.com",
                "My email is not@mail"};
        String regularExpression = "[^\\s]+@[^\\s]+\\.[^\\s]+";

        Pattern pattern = Pattern.compile(regularExpression);

        for (String input : inputs) {
            Matcher matcher = pattern.matcher(input);
            String output = "nothing was found";
            if (matcher.find()) {
                output = matcher.group();
            }
            System.out.println(String.format("'%s': %s", input, output));
        }
    }
}
