public class TextMessage implements Message {
    private String text;

    public TextMessage(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }
}
