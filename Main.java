public class Main {
    public static void main(String[] args) {

        byte bytenumber = 127;
        int intnumber = bytenumber;
        float floatnumber = intnumber;
        double doublenumber = floatnumber;

        System.out.println(bytenumber);
        System.out.println(intnumber);
        System.out.println(floatnumber);
        System.out.println(doublenumber);

        double doublenumber1 = 800;
        float floatnumber1 = (float) doublenumber1;
        int intnumber1 = (int) floatnumber1;
        byte bytenumber1 = (byte) intnumber1;

        System.out.println(doublenumber1);
        System.out.println(floatnumber1);
        System.out.println(intnumber1);
        System.out.println(bytenumber1);









    }
}