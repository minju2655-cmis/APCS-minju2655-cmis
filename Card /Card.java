public class Card
{
    private int suit; 
    private int rank; 
    private boolean faceUp;
    public Card(){
        suit = (int)(Math.random() * 4);
        rank = (int)(Math.random() * 13);
    }
    public Card(int newsuit, int newrank){
        this.suit=newsuit;
        this.rank=newrank;
    }
    public int getRank(){
        return rank;
    }
    public String toString(){
        String[] suits = {"♥","♦","♠","♣"};
        String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String out = String.format("%s%s", ranks[rank], suits[suit]);
        return out;
    }
}