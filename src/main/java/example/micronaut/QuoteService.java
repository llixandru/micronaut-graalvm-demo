package example.micronaut;

import jakarta.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton 
public class QuoteService {

    private static final List<Quote> QUOTES = Arrays.asList(
            new Quote("Well done is better than well said. - Benjamin Franklin"),
            new Quote("Time is the king of all men, he is their parent and their grave, and gives them what he will and not what they crave. - Pericles"),
            new Quote("Morality is simply the attitude we adopt towards people we personally dislike. - Oscar Wilde"),
            new Quote("However beautiful the strategy, you should occasionally look at the results. - Winston Churchil"),
            new Quote("Creativity is allowing yourself to make mistakes. Art is knowing which ones to keep. - Scott Adams"),
            new Quote("In a world where information is abundant and easy to access, the real advantage is knowing where to focus. - James Clear")
    );

    public Quote randomConf() { 
        return QUOTES.get(new Random().nextInt(QUOTES.size()));
    }
}