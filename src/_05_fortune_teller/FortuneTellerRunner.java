package _05_fortune_teller;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
    	System.out.println("Hello user. The hint for the secret location coordinates is it holds a 10 three times both ways.");
        // Welcome the user. Give them a hint for the secret location.

    }
}
