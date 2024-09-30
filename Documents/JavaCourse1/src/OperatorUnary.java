public class OperatorUnary {
    public static void main(String[] args) {
        int x;
        x=10;

        System.out.println("Unary plus"+ +x);
        System.out.println("Unary minus"+ -x);

        //Post increment ++

        System.out.println("\"Post increment\"" + x++); //10
        System.out.println(x); //11

        x=10;
        //Pre increment
        System.out.println("Pre increment"+ ++x);//11

        //Post Decrement --
        System.out.println("Post decrement" + x--); //11

        System.out.println(x);//10

        System.out.println("Pre decrement" + --x); //9

        //Logical Not

        boolean fire=true;

        System.out.println("Logical Not" + !fire);






    }
}
