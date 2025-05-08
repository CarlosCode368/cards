public class Card {
    //private variables
    private boolean isFaceUp;
    private String value; //2-10 J Q K A
    private String suit;  //Hearts Clubs Spades Diamonds


    //constructors
    Card(String suit, String value) {
        this.suit = suit;
        this.value = value;

    }


    //getters
    public String getSuit() {
        if(!isFaceUp){
            return"#"; //hidden
        }
        return this.suit; //real

    }

    public String getValue() {
        if(!isFaceUp){
            return "#";
        }
        return this.value;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue() {
        //aces high or low 1?
        return 0;

    }

    //methods
    boolean flip() {
        this.isFaceUp = !this.isFaceUp; //inverted
        return this.isFaceUp;
    }
    public String toString(){
        return getValue()+getSuit();
    }

    public static void main(String[] args) {
        Card c=new Card("H","A");
        c.flip();
        System.out.println(c);
        c.flip();
        System.out.println(c);
    }
}