public class Main {

    public static void main(String[] args) {
        // Fix me!!! I'm not testable!

        new Main().getCoinFlipResult(true);

    }



    protected String getCoinFlipResult(boolean result) {
        if (result == true){
            return "Heads";
        }
        return "Tails";
    }
}
