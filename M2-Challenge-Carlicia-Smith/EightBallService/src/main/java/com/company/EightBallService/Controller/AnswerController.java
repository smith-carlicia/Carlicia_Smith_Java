package com.company.EightBallService.Controller;

import com.company.EightBallService.Model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {

    Random random = new Random();

    private static List<Answer> answerList = new ArrayList<>(Arrays.asList(
            new Answer (1, "", "Likely."),
            new Answer (2, "", "Follow your gut."),
            new Answer (3, "", "You are the light, don't let it dim your shine."),
            new Answer (4, "", "Always lead with intention."),
            new Answer (5, "", "Not sure. Sleep on it."),
            new Answer (6, "", "No."),
            new Answer (7, "", "If it doesn't bring you joy or temporary peace, don;t bet on it."),
            new Answer (8, "", "Write the pros and cons down. Whatever outweighs the other, lead with that.")
    ));


    @RequestMapping(value = "/answer", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)

    public Answer getAnswer(@RequestBody String question){
        int answerIndex = random.nextInt(answerList.size());
        return answerList.get(answerIndex);
    }
}
