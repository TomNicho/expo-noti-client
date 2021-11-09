package client.network;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

import com.google.gson.Gson;

import client.enums.ExpoNetworkPaths;
import client.types.ExpoNResponse;

public class ExpoPushNClient {
    protected ExpoNResponse sendAsync(ExpoNetworkPaths path, String body) {
        HttpClient client = HttpClient.newBuilder()
            .version(Version.HTTP_2)
            .followRedirects(Redirect.NEVER)
            .connectTimeout(Duration.ofSeconds(10))
        .build();

        HttpRequest request = HttpRequest.newBuilder()
            .timeout(Duration.ofSeconds(30))
            .header("Content-Type", "application/json")
            .uri(URI.create(ExpoNetworkDetails.getFullURL(path)))
            .POST(BodyPublishers.ofString(body))
        .build();

        HttpResponse<String> response = client.sendAsync(request, BodyHandlers.ofString()).join();
        Gson gson = new Gson();
        ExpoNResponse respObj = gson.fromJson(response.body(), ExpoNResponse.class);

        return respObj;
    }

    protected ExpoNResponse sendSync(ExpoNetworkPaths path, String body) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
            .version(Version.HTTP_2)
            .followRedirects(Redirect.NEVER)
            .connectTimeout(Duration.ofSeconds(10))
        .build();

        HttpRequest request = HttpRequest.newBuilder()
            .timeout(Duration.ofSeconds(30))
            .header("Content-Type", "application/json")
            .uri(URI.create(ExpoNetworkDetails.getFullURL(path)))
            .POST(BodyPublishers.ofString(body))
        .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        Gson gson = new Gson();
        ExpoNResponse respObj = gson.fromJson(response.body(), ExpoNResponse.class);

        return respObj;
    }
}
