public class CompressedMessage extends MessageDecorator {
    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return compress(message.getContent());
    }

    private String compress(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
