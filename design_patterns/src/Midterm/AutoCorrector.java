public class AutoCorrector extends TextDecorator {
    public AutoCorrector(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        String correctedText = super.getText();
        correctedText = correctedText.replace("recieve", "receive");
        return correctedText + " (Auto Corrected)";
    }
}