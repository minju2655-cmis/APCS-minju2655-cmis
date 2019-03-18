public class CardApplication
{
    public static void main(String[] args){
        Card c = new Card();
        System.out.print("Random Card: "+c);
        System.out.println("\n");
        ////RandomCard
        
        Card[] deck = new Card[52];
        int d=0;
        for (int rank=0;rank<13;rank++){
            for (int suit=0;suit<4;suit++){
                deck[d]=new Card(suit,rank);
                d++;
            }
        }
        for (Card card:deck){
            System.out.print(card +" "); // -> Vertically
            //System.out.println(card) -> Horizontally
        }
        System.out.println("\n");
        ////Deck
        
        Hand hand=new Hand();
        for (int i=0;i<2;i++){
            hand.addCard(deck[(int)(Math.random()*52)]);
        }
        System.out.println("Random Cards in Your Hand: "+hand);
        ////Random Cards in Your Hand
        
        while (hand.getValue()<21){
            hand.addCard(deck[(int)(Math.random()*52)]);
        }
        System.out.println("The Value of Random Cards in Your Hand: "+hand.getValue());
        System.out.println("\n");
        ////The Value of Cards in Your Hand (Less than 21 -> Adds a Card)
       
    }
}
