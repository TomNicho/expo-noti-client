package client.enums;

public enum ExpoNetworkPaths {
    SEND("send"), RECEIPT("getReceipts");

    public final String postfix;

    private ExpoNetworkPaths(String postfix) {
        this.postfix = postfix;
    } 
}
