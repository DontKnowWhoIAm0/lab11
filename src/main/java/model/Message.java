package model;

public class Message {
    private User sender;
    private User recipient;
    private String text;
    private String dataAndTime;

    public Message() {}

    public Message(User sender, User recipient, String text, String dataAndTime) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.dataAndTime = dataAndTime;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setDataAndTime(String dataAndTime) {
        this.dataAndTime = dataAndTime;
    }

    public User getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public String getDataAndTime() {
        return dataAndTime;
    }
}

