public class OperatorTernary {
    public static void main(String[] args) {
        //ternary operator (condition) ? value : value2

        int x=20,y=30;
        int result = ( x > y) ? 100 : 200;

        System.out.println("Result " + result);
        result = ( x< y)? 100:200;
        System.out.println("Result " + result);

        String text = ( x <y) ? "Helloworld" : "ThankYou";
        System.out.println("Text Message " + text);

        text = ( x >y) ? "Helloworld" : "ThankYou";
        System.out.println("Text Message " + text);




    }

}
