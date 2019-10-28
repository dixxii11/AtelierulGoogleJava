public class SumNonFloatingtypes {

    public static void main(String[] args) {

        sumBytes();
        sumShort();
        sumInt();

    }
    private static void sumInt(){
        int x = 10;
        int y = 5;

        int sum =  (x+y);
        System.out.println(sum);
    }

    private static void sumShort(){
        short x = 10;
        short y = 5;

        short sum = (short) (x+y);
        System.out.println(sum);
    }

    private static void sumBytes(){
        byte x = 10;
        byte y = 5;

        byte sum = (byte) (x+y);
        System.out.println(sum);
    }

}
