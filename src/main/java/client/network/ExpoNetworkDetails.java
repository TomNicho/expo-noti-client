package client.network;

import client.enums.ExpoNetworkPaths;

public class ExpoNetworkDetails {
    public static String baseURL = "https://exp.host/--/api/v2/push/";

    public static String getFullURL(ExpoNetworkPaths path) {
        return baseURL + path.postfix;
    }
}
