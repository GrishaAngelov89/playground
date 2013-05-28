package com.guesstheword;

/**
 * @author grisha_angelov
 */
public class GuessTheWordEngine {
    private final String unknownLetter = "-";
    private final String guessWord;
    private StringBuilder tempWord;

    public GuessTheWordEngine(String guessWord) {
        this.guessWord = guessWord;
        tempWord = new StringBuilder();
        constructTempWord();
    }


    public String guessLetter(String input) {
        String word = "";
        if (!input.equals("")) {
            if (guessWord.contains(input)) {
                word = openLetter(input);
            } else {
                word = tempWord.toString();
            }
        } else {
            word = tempWord.toString();
        }
        return word;
    }

    public String getCurrentWordStatus() {
        return tempWord.toString();
    }

    private void constructTempWord() {
        for (int i = 0; i < guessWord.length(); i++) {
            tempWord.append(unknownLetter);
        }
    }

    private String openLetter(String input) {
        for (int i = 0; i < guessWord.length(); i++) {
            if (guessWord.charAt(i) == input.charAt(0)) {
                tempWord.setCharAt(i, guessWord.charAt(i));
            }
        }
        return tempWord.toString();
    }

}
