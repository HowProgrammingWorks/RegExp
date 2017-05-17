import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Example of using regular expressions for finding strings.
 */
public final class Match {

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
        String input1 = "My email is someones@mail.com";
        String input2 = "My email is not@mail";
        String regularExpression = "[^\\s]+@[^\\s]+\\.[^\\s]+";

        Pattern pattern = Pattern.compile(regularExpression);

        Matcher matcher1 = pattern.matcher(input1);
        String output1 = "Nothing was found";
        if (matcher1.find()) {
            output1 = matcher1.group();
        }
        System.out.println(output1);

        Matcher matcher2 = pattern.matcher(input2);
        String output2 = "Nothing was found";
        if (matcher2.find()) {
            output2 = matcher2.group();
        }
        System.out.println(output2);
    }
}
