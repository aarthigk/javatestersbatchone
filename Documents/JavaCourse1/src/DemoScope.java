/*
   Local variables—in scope from declaration to end of block
   Instance variables—in scope from declaration until object garbage collected
   Class variables—in scope from declaration until program ends
   */
class Order {
    static int orderId = 10011; /// Class variable
    int myPersonalId = 1000; // Instance variable

    public void eat(int noOfOrder) {
        int totalOrder = 1;
        System.out.println(totalOrder); // local
        System.out.println(noOfOrder); // local
    }

    public void demo(){
        myPersonalId =22222;
        System.out.println(myPersonalId);
        System.out.println(orderId);
    }


}
    public class DemoScope {

        public static void main(String arg[]) {
            System.out.println(Order.orderId);
            Order order = new Order();
            System.out.println(order.myPersonalId);
            order.eat(2);
            order.demo();

        }
    }
