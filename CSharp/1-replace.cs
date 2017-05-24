using System;
using System.Text.RegularExpressions;

namespace RegExp
{
    public class ReplaceExample
    {
        public static void Run()
        {
            var input = "abcdef";
            var regex = new Regex("abc");

            var result = regex.Replace(input, "123");

            Console.WriteLine("Original string {0}, " +
                              "Replacement string: {1}", 
                              input, 
                              result);

            input = "abcdefABCEF";
            regex = new Regex("abc", RegexOptions.IgnoreCase);

            result = regex.Replace(input, "123");

            Console.WriteLine("Ignore case:");
            Console.WriteLine("Original string {0}, " +
                              "Replacement string: {1}",
                              input,
                              result);
        }

    }
}
