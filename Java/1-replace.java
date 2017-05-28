import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Example of using regular expressions for replacing strings.
 */
final class Replace {
    /**
     * Private constructor prevents class from being instantiated.
     */
    private Replace() {

    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments, not used
     */
    public static void main(final String[] args) {
        //Using String API
        String regularExpression1 = "abc";
        String input1 = "abcdefg";
        String output1 = input1.replaceAll(regularExpression1, "123");
        System.out.println(output1);

        // Using regex API
        String regularExpression2 = "abc";
        String input2 = "abcdefgABCDEFG";
        Pattern pattern = Pattern.compile(regularExpression2,
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input2);
        String output2 = matcher.replaceAll("789");
        System.out.println(output2);
    }
}
