package Patterns.Midterm;
abstract class TextDecorator extends Text {
    protected Text textComponent;

    public TextDecorator(Text textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String getText() {
        return textComponent.getText();
    }
}