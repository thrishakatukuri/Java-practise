package typecasting;
public class typecasting {
    public static void main(String[] args) {
        byte a = 127;
        int b = a;
        System.out.println(b);

        double value = 127.991234567890000009876543;
        float result = (float) value;
        System.out.println(result); // Output: 9

        double value1 = 127.991235567890000009876543;
        float result1 = (float) value1;
        System.out.println(result1); // Output: 9

        int c = 129;
        byte d =(byte) c;
        System.out.println(d);

        float value2 = 333.0f;
        byte result2 = (byte) value2;
        System.out.println(result2); // Output: 9

        // System.out.println((259%256)-256);

        String name = "hello";
        System.out.println(name);
        System.out.println(name.length());
        String name1 = name.concat(" world");
        System.out.println(name1);

    }
}
