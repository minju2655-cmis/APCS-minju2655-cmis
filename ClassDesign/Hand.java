import java.util.*;
public class Hand
{
    private List<Card> cards;
    public Hand(){
        cards = new ArrayList<Card>();
    }
    public void addCard(Card card){
        cards.add(card);
    }
    public int getValue(Card card){
        //Face Value -> 2~10
        //J,Q,K -> 10
        //A => 1 or 10
        //person with two cards of 21 wins the person with three cards of 21
        int score=0;
        
        return score;
    }
    public String toString(){
        String out="";
        for (Card card:cards){
            out+=card.toString()+" ";
        }
        return out;
    }
}


