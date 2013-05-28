package com.guesstheword;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author grisha_angelov
 */
public class GuessTheWordEngineTest {
    private GuessTheWordEngine guessTheWordEngine;

    @Before
    public void setUp() {
        guessTheWordEngine = new GuessTheWordEngine("programmer");
    }

    @Test
    public void guessLetterHappyPath() {
        String result = guessTheWordEngine.guessLetter("r");
        assertEquals("-r--r----r", result);
    }

    @Test
    public void shouldReturnCurrentWordWhenInputIsEmpty() {
        guessTheWordEngine.guessLetter("p");
        String result = guessTheWordEngine.guessLetter("");
        assertEquals("p---------", result);
    }

    @Test
    public void shouldReturnCurrentWordWhenInputIsNotContained() {
        guessTheWordEngine.guessLetter("p");
        String result = guessTheWordEngine.guessLetter("q");
        assertEquals("p---------", result);
    }
}
