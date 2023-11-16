function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word
    const reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Convert the word to an array of characters, reverse it, and join it back into a word
    return word.split('').reverse().join('');
}

const inputSentence = "This is a sunny day"; // Replace this with your input sentence
const reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);



// output =
// sihT si a ynnus yad