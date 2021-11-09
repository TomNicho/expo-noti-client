package client;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import client.types.ExpoNMessage;
import client.types.ExpoNResponse;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        String testToken = "12345678-abcd-efgh-ijkl-0987654321ab";
        ExpoNClient client = new ExpoNClient();

        
        if (ExpoNClient.isExpoPushToken(testToken)) {
            List<String> tokens = new ArrayList<>();
            tokens.add(testToken);

            ExpoNMessage message = ExpoNMessage.builder()
                .setTo(tokens)
                .setBody("Hello")
                .setTitle("Title")
                .setSubtitle("Subtitle")
            .build();

            try {
                ExpoNResponse resp = client.sendExpoPushSync(message);
                System.out.println(resp.toJson());
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        
    }
}
