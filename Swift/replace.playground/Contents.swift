import Foundation

let helloString = "Hello, World!" // Defining initial string

// Initializing regular expression
var replaceRegExp: NSRegularExpression?

do {
    replaceRegExp = try NSRegularExpression(pattern: "World", options: .allowCommentsAndWhitespace)
} catch let error as NSError { // Handling exception
    print(error.localizedDescription)
}

// Initializing new string with substring, replaced by template
let newString = replaceRegExp?.stringByReplacingMatches(in: helloString, options: .withTransparentBounds, range: NSRange(location: 0, length: helloString.characters.count), withTemplate: "Kitten")

print(newString ?? "Replacing failed", "\n")