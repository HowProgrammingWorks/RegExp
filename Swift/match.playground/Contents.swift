import Foundation

let testString = "one 1 two 2 three 3"

let pattern = "[0-9]" // Matching numbers
let nsString = testString as NSString // Cating to NSString to use special methods

// Trying to initialize regex
do {
    let regex = try NSRegularExpression(pattern: pattern, options: [])
    let results = regex.matches(in: testString, options: [], range: NSMakeRange(0, testString.characters.count)) // Matches
    let result = results.map { nsString.substring(with: $0.range) }
    print(result)
} catch let error as NSError { // Handling exception
    print("Invalid regex: \(error.localizedDescription)")
}



