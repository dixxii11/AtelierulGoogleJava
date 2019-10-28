public class PostfixIncrement {
    public static void main(String[] args) {
        int x = 0;

        while(x++ < 10){
        }
        checkValueX(x);
    }
    private static void checkValueX(int x) {
        int expValue = 11;

        System.out.println("exp value " + expValue + " " + x);
    }

}

