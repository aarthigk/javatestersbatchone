public class VariableDemo {
    short numberShort=12786;
    int numberInt=127867688;
    long numberLong=9999999999999l;
    float numberFloat=556.00001f;
    double numberDouble=5556.000001;
    boolean flag=false;
    byte myByte = (byte) 130;
    char letter=100;


    public void messagePrinter(){
        short numberShortA=12786;
        System.out.println(numberDouble);

    }
    public void messagePrinterB(){

        System.out.println(numberFloat);

    }

    public static void main(String[] args) {
        VariableDemo nm = new VariableDemo();
        nm.messagePrinter();


        int value = 2147483646-1;
        for(int i = 0; i < 4; i++, value++) {
            System.out.println(value);
        }

    }


  }

