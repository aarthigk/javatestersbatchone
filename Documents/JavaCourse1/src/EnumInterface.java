interface Greetings{
    public void printMessage();
}
enum Moves implements Greetings{
    SAFE{

        public void printMessage(){
            System.out.println("ValidMove");
        }

    },

    UNSAFE{
        public void printMessage(){
            System.out.println("InvalidMove");
        }

    };


}

public class EnumInterface {
    public static void main(String[] args) {
        Moves moves = Moves.SAFE;
        moves.printMessage();

        moves=Moves.UNSAFE;
        moves.printMessage();

    }
}
