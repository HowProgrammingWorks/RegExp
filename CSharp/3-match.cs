using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace RegExp
{
    public class MatchExample
    {
        public static void Run()
        {
            const string input = "Hello user1@domain.com and user2@domain.com";
            
            var regex = new Regex("\\S+@[\\S.]+");
            var results = regex.Matches(input)
                               .OfType<Match>();

            Console.WriteLine("Match Example:");
            Console.WriteLine("Original string: {0} \n" +
                              "Mathces: {1}",
                              input,
                              string.Join(", ", results.Select(r => r.Value)));
        }
    }
}
