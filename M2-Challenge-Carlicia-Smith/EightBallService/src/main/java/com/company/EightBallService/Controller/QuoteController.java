package com.company.EightBallService.Controller;

import com.company.EightBallService.Model.Quote;
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
public class QuoteController {

    Random random = new Random();

    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote (1, "Solange", "Do nothing without intention."),
            new Quote (2, "Coco Chanel", "The way to get started is to quit talking and begin doing."),
            new Quote (3, "Coco Chanel", "In order to be irreplaceable one must always be different."),
            new Quote (4, "Serena Van Der Woodsen", "Don't let people tell you who you are. You tell them."),
            new Quote (5, "Oprah", "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough."),
            new Quote (6, "Maya Angelou", "You will face many defeats in life, but never let yourself be defeated."),
            new Quote (7, "Bob Marley", " Love the life you live. Live the life you love."),
            new Quote (8, "Audrey Hepburn", "Nothing is impossible, the word itself says, ‘I'm possible!'"),
            new Quote (9, "Hey Fran Hey", "I stopped looking for the light. Decided to become it myself."),
            new Quote(10, "Forrest Gump ", "My mama always said, life is like a box of chocolates. You never know what you’re gonna get.")
            ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)

    public Quote getQuote(){
        int quoteIndex = random.nextInt(quoteList.size());
        return quoteList.get(quoteIndex);
    }
}
