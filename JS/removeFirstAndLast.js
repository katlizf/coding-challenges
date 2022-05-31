// Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

function removeChar(str){
    let result = str.substring(1, str.length-1)
    return result
}

// on first attempt, thought to use splice() but found substring to be easier and with fewer lines of code