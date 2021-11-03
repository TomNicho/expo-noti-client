package client.enums;

public enum MessagePriority {
    DEFAULT("default"), 
    NORMAL("normal"), 
    HIGH("high");

    public final String label;

    private MessagePriority(String label) {
        this.label = label;
    }
}
