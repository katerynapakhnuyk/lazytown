import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampMessage extends MessageDecorator {
    public TimestampMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return addTimestamp(message.getContent());
    }

    private String addTimestamp(String text) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "[" + dateFormat.format(new Date()) + "] " + text;
    }
}
