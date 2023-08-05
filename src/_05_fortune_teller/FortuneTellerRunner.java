package _05_fortune_teller;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
    	System.out.println("Hello user. The hint for the secret location coordinates is that it feels awfully close to the center. ");
        // Welcome the user. Give them a hint for the secret location.

    }
}
