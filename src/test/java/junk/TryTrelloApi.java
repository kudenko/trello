package junk;

import com.trello.api.TrelloRestClient;
import com.trello.api.models.Card;
import org.testng.annotations.Test;

import java.io.IOException;

public class TryTrelloApi {
    TrelloRestClient client = new TrelloRestClient();


    @Test
    public void go() throws IOException {
        Card card = new Card();
        card.name = "My Test Card";
        //Card card1 = client.cardServise.createCard("5d12443aef9e597d93b16cb3", card).execute().body();
       //client.cardServise.getCard("5d12443aef9e597d93b16cb3").execute().body();
        client.cardServise.deleteCard("5d1279a4ee96773601d522d5").execute();
       // System.out.println(card1.id);
    }
}
