package example.micronaut;

import io.micronaut.core.annotation.Introspected;

@Introspected 
public class Quote {

    private final String quote;

    public Quote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }
}