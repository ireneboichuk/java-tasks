public class Lesson2 {
    public static void main(String[] args) {
        byte testByte1, testByte2, testByte3, testByte4;
        testByte1 = 100; //Decimal
        testByte2 = 0144; //Octalß
        testByte3 = 0b1100100; //Binary
        testByte4 = 0x64; //Hexadecimal

        short testShort1, testShort2, testShort3, testShort4;
        testShort1 = 200; //Decimal
        testShort2 = 0310; //Octal
        testShort3 = 0b11001000; //Binary
        testShort4 = 0xC8; //Hexadecimal

        int testInt1, testInt2, testInt3, testInt4;
        testInt1 = 300; //Decimal
        testInt2 = 0454; //Octal
        testInt3 = 0b100101100; //Binary
        testInt4 = 0x12C; //Hexadecimal

        long testLong1, testLong2, testLong3, testLong4;
        testLong1 = 400L; //Decimal
        testLong2 = 0620L; //Octal
        testLong3 = 0b110010000L; //Binary
        testLong4 = 0x190L; //Hexadecimal

        char testChar1, testChar2, testChar3, testChar4;
        testChar1 = 500; //Decimal
        testChar2 = 0764; //Octal
        testChar3 = 0b111110100; //Binary
        testChar4 = 0x1F4; //Hexadecimal

        float testFloat1 = 10.45f;
        double testDouble1 = 90.55;

        int sumInt = testInt1 + testInt2 + testInt3 + testInt4;
        int sumByte = testByte1 + testByte2 + testByte3 + testByte4;
        int sumShort = testShort1 + testShort2 + testShort3 + testShort4;
        int sumChar = testChar1 + testChar2 + testChar3 + testChar4;
        long sumLong = testLong1 + testLong2 + testLong3 + testLong4;
        double sumDouble = testDouble1 + testFloat1;

        long result = (long) (sumInt + sumByte + sumShort + sumChar + sumLong + sumDouble);
        out.println("Result value: " + result);
    }
}
