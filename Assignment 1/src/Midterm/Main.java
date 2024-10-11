public class Main {
    public static void main(String[] args) {
        try {
            Text txt = new InputText();
            System.out.println("Original: " + txt.getText());

            txt = new GrammarChecker(txt);
            txt = new SpellChecker(txt);
            txt = new AutoCorrector(txt);

            System.out.println("Corrected: " + txt.getText());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}