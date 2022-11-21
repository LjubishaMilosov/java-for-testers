package com.serenitydojo.exeptions;

import com.serenitydojo.exceptions.FileHasNoWordsException;
import com.serenitydojo.exceptions.WordCounter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithExceptions {

    WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldCountTheWordsInAString(){

        int numberOfWords = wordCounter.numberOfWordsIn("Some string");
        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForNullString(){

        assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);
    }

    @Test
    public  void shouldCountWordsInAFile() throws Exception {

        int numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");
    }

    @Test//(expected = FileHasNoWordsException.class)
    public  void  shouldReportAnErrorWhenTheFileDoesNotExist() throws Exception {
        int numberOfWords = wordCounter.numberOfWordsInFile("file-that-does-not-exist.txt");
        assertThat(numberOfWords).isEqualTo(0);
    }
    @Test(expected = FileHasNoWordsException.class)
    public void shouldThrowMeaningfulExceptionIfThereAreNoWordsInTheFile() throws Exception{
        wordCounter.numberOfWordsInFile("src/main/resources/no_words.txt");


    }
}
