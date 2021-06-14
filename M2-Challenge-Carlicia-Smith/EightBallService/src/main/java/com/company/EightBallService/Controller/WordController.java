package com.company.EightBallService.Controller;

import com.company.EightBallService.Model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {

    Random random = new Random();

    private static List<Word> wordList = new ArrayList<>(Arrays.asList(
            new Word (1, "Carly","Do Not Make Your Goals Conditional."),
            new Word(2, "Intention", "Do nothing without intention."),
            new Word(3, "Accountability", "Hold yourself accountable for the thing you can and cannot change."),
            new Word(4, "Breathe", "You got this."),
            new Word(5, "Confidence", "Be confident in what you choose to do."),
            new Word(6, "Failure", "Failure is just another tool that will lead you to success"),
            new Word(7, "Rest", "Take some time to recalibrate, let your mind and body refresh."),
            new Word(8, "Celebrate", "Celebrate yourself. You deserve it."),
            new Word(9, "Silence", "Sometimes it's best to keep things to yourself without inviting the whole world to chime in and watch you."),
            new Word(10, "Clarity", "Do what you know is best for you.")
    ));


    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Word getWord(){
        int wordIndex = random.nextInt(wordList.size());
            return wordList.get(wordIndex);
    }

}
