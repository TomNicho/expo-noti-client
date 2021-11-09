package client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import client.types.ExpoNMessage;
import client.types.ExpoNPush;
import client.types.ExpoNResponse;

public class ModuleTest 
{
    @Test
    public void PushSyncExpoCall()
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
                assertEquals("{\"data\":[{\"details\":{\"error\":\"DeviceNotRegistered\"}}]}", resp.toJson());
                return;
            } catch (Exception e) {
                fail();
            }
        }
        
    }

    @Test
    public void PushAsyncExpoCall() {
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
                ExpoNResponse resp = client.sendExpoPushAsync(message).join();
                assertEquals("{\"data\":[{\"details\":{\"error\":\"DeviceNotRegistered\"}}]}", resp.toJson());
                return;
            } catch (Exception e) {
                fail();
            }
        }
    }

    @Test
    public void ReceiptSyncExpoCall()
    {
        String testToken = "12345678-abcd-efgh-ijkl-0987654321ab";
        ExpoNClient client = new ExpoNClient();

        if (ExpoNClient.isExpoPushToken(testToken)) {
            List<String> tokens = new ArrayList<>();
            tokens.add(testToken);

            ExpoNPush testPush = ExpoNPush.builder()
                .setIds(tokens)
            .build();

            try {
                ExpoNResponse resp = client.sendExpoReceiptSync(testPush);
                assertEquals("{\"data\":[{\"details\":{\"error\":\"DeviceNotRegistered\"}}]}", resp.toJson());
                return;
            } catch (Exception e) {
                fail();
            }
        }
    }

    @Test
    public void ReceiptAsyncExpoCall() {
        String testToken = "12345678-abcd-efgh-ijkl-0987654321ab";
        ExpoNClient client = new ExpoNClient();

        if (ExpoNClient.isExpoPushToken(testToken)) {
            List<String> tokens = new ArrayList<>();
            tokens.add(testToken);

            ExpoNPush testRec = ExpoNPush.builder()
                .setIds(tokens)
            .build();

            try {
                ExpoNResponse resp = client.sendExpoReceiptAsync(testRec).join();
                assertEquals("{\"data\":[{\"details\":{\"error\":\"DeviceNotRegistered\"}}]}", resp.toJson());
                return;
            } catch (Exception e) {
                fail();
            }
        }
    }
}
