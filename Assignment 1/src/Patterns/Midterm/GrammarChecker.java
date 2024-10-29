package Patterns.Midterm;
public class GrammarChecker extends TextDecorator {
    public GrammarChecker(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        String correctedText = super.getText();
        correctedText = correctedText.replace("I is", "I am");
        return correctedText + " (Grammar Checked)";
    }
}