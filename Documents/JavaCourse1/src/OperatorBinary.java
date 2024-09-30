public class OperatorBinary {
    public static void main(String[] args) {

        //Shortcircuit operator && and ||
        int a=5,b=10;
        boolean result;
        result = (a<0 || (b >10));

        System.out.println(result);
        result = (a>0 || (b >10));
        System.out.println(result);

        result = (a>0 && (b >=10));
        System.out.println(result);
















//        //Assignment Operator = , Compound +=, -=, *=, /=,%=
//        int x;
//        x=20;
//        System.out.println(x);
//
//        //compound
//        x+=5; // x=x+5
//        System.out.println(x);
//
//        x-=5;
//        System.out.println(x);
//
//        x*=5;
//        System.out.println(x);
//
//        x/=5;
//        System.out.println(x);
//
//        x%=5;
//        System.out.println(x);
//
//
//
//





















//        //Bitwise  & ,| , ^ , << , >>
//        int a=1,b=1;
//        // 0001
//        // 0001
//
//        System.out.println("A & B " + ( a & b)); //1
//        System.out.println("A OR B " + ( a|b)); //1
//        a=2;
//        //0010
//        //0001
//        System.out.println("A OR B " + ( a|b)); //  11 = 3
//        System.out.println( "A & B " + ( a&b));//0 0 = 0
//
//        System.out.println("A XOR B "+ (a^b)); // 11 = 3
//
//
//        //shift left
//        a=1;b=1;
//        // 0001 --? 0100  -- >1 * 2 = 2
//        // 0001 --->0000 01 -->1 /2 = 0
//
//        System.out.println(" A << 2 " + ( a <<2)); //2
//        System.out.println(" B >> 2 " + (b >> 2)); //0























//        //Logical Operator && ||
//
//        boolean result = (5 > 3) && (8 < 6);
//        System.out.println("LogicalAnd " + result); // true
//
//        result = (5 <3) || ( 6 >8);
//        System.out.println("Logical OR " + result); // true














//        //relational Operator,  == != < > <= >=
//        int number1 =20 , number2 = 25;
//        boolean result = number1 != number2;
//        System.out.println( "Equals to " +( number1 == number2));  //false
//        System.out.println( "Not Equals to " +( number1 != number2)); // true
//        System.out.println( "Less than " +( number1 < number2)); // true
//        System.out.println( "Greater than  " +( number1 > number2)); //false
//        System.out.println( "Less than equals to " +( number1 <= number2)); //true
//        System.out.println( "Grater than equals to " +( number1 >= number2));
//
//        System.out.println( "Not Equals to " + result);//true














//  //Arithmetic operators + - * / %
//        int x=20, y=10;
//        System.out.println("x + y value is  "+ (x+y)); //30
//        System.out.println("x - y value is  "+ (x-y)); //10
//        System.out.println("x * y value is  "+ (x*y)); //200
//        System.out.println("x / y value is  "+ (x/y)); //2 - quotient
//        double num1=25;
//        System.out.println("x / y value is  "+ (num1/y));
//        System.out.println//Relational operator == != < > <= >=("x % y value is  "+ (x%y)); //0 - remainder
//





    }
}
