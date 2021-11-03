package client.network;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

import client.enums.ExpoNetworkPaths;
import client.types.ExpoNResponse;

public class ExpoPushNClient {
    public ExpoNResponse sendAsync(ExpoNetworkPaths path, Object body) {
        HttpClient client = HttpClient.newBuilder()
            .version(Version.HTTP_2)
            .followRedirects(Redirect.NEVER)
            .connectTimeout(Duration.ofSeconds(10))
        .build();

        HttpRequest request = HttpRequest.newBuilder()
            .timeout(Duration.ofSeconds(30))
            .header("Content-Type", "application/json")
            .uri(URI.create(ExpoNetworkDetails.getFullURL(path)))
            .POST(BodyPublishers.noBody())
        .build();

        HttpResponse<String> response = client.sendAsync(request, BodyHandlers.ofString()).join();

        return new ExpoNResponse();
    }

    public ExpoNResponse sendSync(ExpoNetworkPaths path, Object body) {
        HttpClient client = HttpClient.newBuilder()
            .version(Version.HTTP_2)
            .followRedirects(Redirect.NEVER)
            .connectTimeout(Duration.ofSeconds(10))
        .build();

        HttpRequest request = HttpRequest.newBuilder()
            .timeout(Duration.ofSeconds(30))
            .header("Content-Type", "application/json")
            .uri(URI.create(ExpoNetworkDetails.getFullURL(path)))
            .POST(BodyPublishers.noBody())
        .build();

        return new ExpoNResponse();
    }
}
