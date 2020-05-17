import Foundation

let initialString = "This-is-string-to-split-by-special-character" // Defining initial string

let splitter = "-" // Defining splitter
let stop = "//"

// Initializing regular expression
var splitRegExp: NSRegularExpression?
do {
    splitRegExp = try NSRegularExpression(pattern: splitter, options: .allowCommentsAndWhitespace)
} catch let error as NSError { // Handling exception
    print(error.localizedDescription)
}

let modifiedString = splitRegExp?.stringByReplacingMatches(in: initialString, options: .withTransparentBounds, range: NSRange(location: 0, length: initialString.characters.count), withTemplate: stop)

// But in Swift this method can be used
print(modifiedString?.components(separatedBy: stop) ?? "Splitting failed", "\n")