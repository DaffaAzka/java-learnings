package data_types;

public class IntegerT {
    public static void main(String[] args) {

        byte thisByte = 100;
        short thisShort = 1_000;
        int thisInt = 1_000_000;
        long thisLong = 1_000_000L;

//      Floating point numbers

        float thisFloat = 98.8F;
        double thisDouble = 9999.8;

//      Literals numbers

        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b101010;

//      Conversion data types number

        int data = 10;

//          1. Widening casting ( Auto ) :
            long toLong = data;

//          2. Narrowing casting ( Manual ) :
            short toShort = (short) data;

    }
}
