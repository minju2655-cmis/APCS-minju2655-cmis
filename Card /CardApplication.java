public class CardApplication
{
    public static void main(String[] args){
        Card c = new Card();
        System.out.print(c);
        System.out.println("\n");
        ////
        Card[] deck = new Card[52];
        int d=0;
        for (int rank=0;rank<13;rank++){
            for (int suit=0;suit<4;suit++){
                deck[d]=new Card(suit,rank);
                d++;
            }
        }
        for (Card card:deck){
            System.out.println(card);
        }
        System.out.println("\n");
        ////
        Hand hand=new Hand();
        for (int i=0;i<2;i++){
            hand.addCard(deck[(int)(Math.random()*52)]);
        }
        System.out.println(hand);
        ////
        while (hand.getValue()<21){
            hand.addCard(deck[(int)(Math.random()*52)]);
        }
        System.out.println(hand.getValue());
        System.out.println("\n");
        ////
        //Deck deck=new Deck(5);
        //while (deck.nCards()<0){
        //SO CONFUSINNGGGGG
        //index 0= dealer
        //index 1= player 1
        //index 2= player 2
        //index 3= player 3
        //index 4= player 4
        //For (int i=0;i<5;i++){}
        //}
    }
}
