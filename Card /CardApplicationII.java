import java.util.*;
public class CardApplicationII
{
    public static void main(String[] args){
        Card[] deck1 = new Card[52];
        int d=0;
        for (int rank=0;rank<13;rank++){
            for (int suit=0;suit<4;suit++){
                deck1[d]=new Card(suit,rank);
                d++;
            }
        }
        for (Card card:deck1){
            System.out.print(card +" "); 
        }
        ////
        
        //Scanner Scan = new Scanner (System.in);
        //int players = Scan.nextInt();
        Deck deck=new Deck(5);
        List<Hand> hands=new ArrayList<Hand>();
        for (int i=0;i<5;i++){
            Hand playerhands=new Hand();
            for(int x=0;x<2;i++){
                playerhands.addCard(deck1[(int)(Math.random()*52)]);
            }
            hands.add(playerhands);
        }
        //index 0= dealer
        //index 1= player 1
        //index 2= player 2
        //index 3= player 3
        //index 4= player 4
        }
    //Giving Random Cards to the Players
}

//List<Hand> hands
//to get the first value -> hands.get(0)
//to get the last value -> hands.get(hand.size()-1)
//hands.get(hand.size()-1).getValue()

