using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace RegExp
{
    public class SplitExample
    {
        public static void Run()
        {
            const string input = "Hello World, here we are!";
            
            var results = Regex.Split(input, "\\W+");

            Console.WriteLine("Split Example: " +
                              "Original string: {0}, \n" +
                              "Splitted values: {1}",
                              input,
                              string.Join(", ", results));
        }
    }
}
