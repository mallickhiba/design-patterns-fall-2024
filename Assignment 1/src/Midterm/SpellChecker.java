public class SpellChecker extends TextDecorator {
    public SpellChecker(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        String correctedText = super.getText();
        correctedText = correctedText.replace("teh", "the");
        return correctedText + " (Spell Checked)";
    }
}