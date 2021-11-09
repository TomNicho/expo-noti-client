package client;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import client.enums.ExpoNetworkPaths;
import client.network.ExpoPushNClient;
import client.types.ExpoNMessage;
import client.types.ExpoNResponse;

public class ExpoNClient extends ExpoPushNClient {

    public ExpoNClient() {
        super();
    }

    public CompletableFuture<ExpoNResponse> sendExpoPushAsync(ExpoNMessage body) {
        return super.sendAsync(ExpoNetworkPaths.SEND, body.toJson());
    }

    public ExpoNResponse sendExpoPushSync(ExpoNMessage body) throws IOException, InterruptedException {
        return super.sendSync(ExpoNetworkPaths.SEND, body.toJson());
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
