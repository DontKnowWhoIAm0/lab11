public class Message {
    private String sender;
    private String recipient;
    private String text;
    private String dataAndTime;

    public Message() {}

    public Message(String sender, String recipient, String text, String dataAndTime) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.dataAndTime = dataAndTime;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setDataAndTime(String dataAndTime) {
        this.dataAndTime = dataAndTime;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public String getDataAndTime() {
        return dataAndTime;
    }
}

