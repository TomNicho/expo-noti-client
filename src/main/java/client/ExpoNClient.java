package client;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import com.google.gson.Gson;

import client.enums.ExpoNetworkPaths;
import client.network.ExpoPushNClient;
import client.types.ExpoNMessage;
import client.types.ExpoNPush;
import client.types.ExpoNStatus;
import client.types.ExpoNTicket;

public class ExpoNClient extends ExpoPushNClient {

    public ExpoNClient() {
        super();
    }

    public CompletableFuture<ExpoNTicket> sendExpoPushAsync(ExpoNMessage body) {
        return super.sendAsync(ExpoNetworkPaths.SEND, body.toJson()).thenApply(resp -> {
            Gson gson = new Gson();
            return gson.fromJson(resp.body(), ExpoNTicket.class);
        });
    }

    public ExpoNTicket sendExpoPushSync(ExpoNMessage body) throws IOException, InterruptedException {
        String response = super.sendSync(ExpoNetworkPaths.SEND, body.toJson()).body();
        Gson gson = new Gson();
        return gson.fromJson(response, ExpoNTicket.class);
    }

    public CompletableFuture<ExpoNStatus> sendExpoReceiptAsync(ExpoNPush body) {
        return super.sendAsync(ExpoNetworkPaths.RECEIPT, body.toJson()).thenApply(resp -> {
            Gson gson = new Gson();
            return gson.fromJson(resp.body(), ExpoNStatus.class);
        });
    }

    public ExpoNStatus sendExpoReceiptSync(ExpoNPush body) throws IOException, InterruptedException {
        String resp = super.sendSync(ExpoNetworkPaths.RECEIPT, body.toJson()).body();
        Gson gson = new Gson();
        return gson.fromJson(resp, ExpoNStatus.class);
    }

    /*
    // Static Functions
    */
    
    public static Boolean isExpoPushToken(String token) {
        String token_regex = "[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12}";
        String first_prefix = "ExpoPushToken[";
        String second_prefix = "ExponentPushToken[";
        String postfix = "]";
        
        //Default Format
        if (token.matches(token_regex)) return true;

        //Other Possible Formats
        if (!token.endsWith(postfix)) return false;
        if (token.startsWith(first_prefix)) return true;
        if (token.startsWith(second_prefix)) return true;
        return false;
    }
}
