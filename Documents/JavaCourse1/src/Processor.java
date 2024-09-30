interface Screen{
    void display(String screenname);
}

class DellScreen implements Screen {
    public void display(String screenname) {
        System.out.println("Dell Screen" +screenname);
    }
}

public class Processor implements Screen {

    public void display(String screenname) {
        System.out.println(screenname);
    }

    public static void main(String[] args) {
        Processor processor = new Processor(); // processor is class type
        processor.display("SmartScreen");

        Screen screen = new Processor(); // screen is reference type
        screen.display("LCD Screen");

        screen = new DellScreen();
        screen.display("LED screen");

    }


}